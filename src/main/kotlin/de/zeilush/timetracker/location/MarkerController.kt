package de.zeilush.timetracker.location

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by zeilush on 6/19/17.
 */
@RestController
@RequestMapping("/marker")
class MarkerController(val markerRepo: MarkerRepository) {
    val counter = AtomicLong()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun updateMarker(@RequestBody marker: MarkerDto): MarkerDto {
        marker.id = UUID.randomUUID();

        return markerRepo.save(marker)
    }

    @RequestMapping(value = "{id}", method = arrayOf(RequestMethod.PUT))
    fun createMarker(@PathVariable("id") id: UUID, @RequestBody marker: MarkerDto): MarkerDto {
        val markerDb = markerRepo.findOne(id)

        markerDb.label = marker.label
        markerDb.latitude = marker.latitude
        markerDb.longitude = marker.longitude
        markerDb.title = marker.title

        return markerRepo.save(markerDb)
    }
}