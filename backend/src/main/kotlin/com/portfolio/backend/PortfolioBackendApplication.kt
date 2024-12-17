package com.portfolio.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PortfolioBackendApplication

fun main(args: Array<String>) {
	runApplication<PortfolioBackendApplication>(*args)
}
