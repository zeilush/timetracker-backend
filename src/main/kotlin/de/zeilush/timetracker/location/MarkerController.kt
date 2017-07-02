package de.zeilush.timetracker.location

import org.bson.types.ObjectId
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createMarker(@RequestBody marker: Marker): Marker {
        marker.id = UUID.randomUUID();

        return markerRepo.save(marker);
    }

    @PutMapping(value = "{id}")
    fun updateMarker(@PathVariable("id") id: UUID, @RequestBody request: Marker): Marker {
        val markerDb = markerRepo.findOne(id);

        markerDb.update(request);

        return markerRepo.save(markerDb);
    }
}