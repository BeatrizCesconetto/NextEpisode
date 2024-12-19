package br.com.nextepisode

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["br.com.nextepisode"])
class NextEpisodeApplication

fun main(args: Array<String>) {
	runApplication<NextEpisodeApplication>(*args)
}