package io.github.marcosstefani.nina

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class NinaApplication

fun main(args: Array<String>) {
	runApplication<NinaApplication>(*args)
}
