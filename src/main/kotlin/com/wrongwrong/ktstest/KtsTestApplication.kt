package com.wrongwrong.ktstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtsTestApplication

fun main(args: Array<String>) {
	runApplication<KtsTestApplication>(*args)
}
