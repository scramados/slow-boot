package com.scramados.slowboot.configuration

import com.scramados.slowboot.data.StartupEntry
import com.scramados.slowboot.properties.StartupProperties
import com.scramados.slowboot.repository.StartupEntryRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.InetAddress

@Configuration
class StartupConfiguration(private val properties: StartupProperties) {
    val logger: Logger = LoggerFactory.getLogger(javaClass)

    @Bean
    fun databaseInitializer(startupEntryRepository: StartupEntryRepository) = ApplicationRunner {
        logger.info("Starting Initializer")

        val startup = startupEntryRepository.save(
            StartupEntry(
                InetAddress.getLocalHost().hostName
            )
        )

        val secondsToStartup = properties.initializeDelay.toInt()
        0.rangeTo(secondsToStartup).forEach {
            logger.info("Initializing - $it / $secondsToStartup")
            Thread.sleep(1_000)
        }

        startup.completed = true
        startupEntryRepository.save(startup)

        logger.info("Finished Initializing")
    }
}