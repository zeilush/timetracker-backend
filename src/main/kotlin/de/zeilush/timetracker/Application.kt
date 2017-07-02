package de.zeilush.timetracker

import org.joda.time.DateTime
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.text.DateFormatSymbols
import java.text.SimpleDateFormat
import java.text.DateFormat
import java.util.*
import java.time.temporal.TemporalAdjusters
import java.time.temporal.IsoFields
import sun.security.krb5.internal.KDCOptions.with
import java.time.LocalDate


/**
 * Created by wkss on 6/19/17.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableAutoConfiguration
open class Application

fun main(args: Array<String>) {
    org.springframework.boot.SpringApplication.run(de.zeilush.timetracker.Application::class.java, *args)
}
