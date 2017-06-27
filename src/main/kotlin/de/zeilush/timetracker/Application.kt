package de.zeilush.timetracker

import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * Created by wkss on 6/19/17.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableAutoConfiguration
open class Application

fun main(args: Array<String>) {
    org.springframework.boot.SpringApplication.run(de.zeilush.timetracker.Application::class.java, *args)
}