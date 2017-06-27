package de.zeilush.timetracker

import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by zeilush on 6/19/17.
 */
@RestController
@RequestMapping("/location")
class LocationController(val localationRepo: LocationRepository) {
    val counter = AtomicLong()

    @PostMapping
    fun updateLocation(@RequestBody location: LocationDto): LocationDto {
        localationRepo.save(location)

        return LocationDto("test","test",1F,1F, "title", "lable")
    }

}