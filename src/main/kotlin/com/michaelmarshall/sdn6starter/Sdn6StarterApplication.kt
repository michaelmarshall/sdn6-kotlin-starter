package com.michaelmarshall.sdn6starter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory
import org.springframework.boot.web.server.ErrorPage
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpStatus

// refactor into the folder structure that meets your needs

@SpringBootApplication
class Sdn6StarterApplication

fun main(args: Array<String>) {
	runApplication<Sdn6StarterApplication>(*args)
}
