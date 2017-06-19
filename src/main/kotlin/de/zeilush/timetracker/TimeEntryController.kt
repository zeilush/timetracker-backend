package de.zeilush.timetracker

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by wkss on 6/19/17.
 */
@RestController
class GreetingController {
    val counter = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): TimeEntry {
        return TimeEntry(counter.incrementAndGet(), "Hello, $name")
    }
}