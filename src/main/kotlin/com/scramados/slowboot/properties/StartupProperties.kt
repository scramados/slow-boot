package com.scramados.slowboot.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration


@ConstructorBinding
@Configuration
@ConfigurationProperties(prefix = "startup")
class StartupProperties {
    lateinit var initializeDelay: String
}