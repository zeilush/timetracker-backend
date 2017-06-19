package de.zeilush.timetracker

/**
 * Created by wkss on 6/19/17.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
open class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            org.springframework.boot.SpringApplication.run(de.zeilush.timetracker.Application::class.java, *args)
        }
    }
}