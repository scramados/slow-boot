package com.scramados.slowboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SlowBootApplication

fun main(args: Array<String>) {
    runApplication<SlowBootApplication>(*args)
}
