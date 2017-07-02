package de.zeilush.timetracker.location

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.PersistenceConstructor
import java.util.*

/**
 * Created by zeilush on 6/19/17.
 */
@Document(collection = "marker")
data class Marker @PersistenceConstructor constructor(
        @Id var id: UUID? = null,
        val userId: String,
        var latitude: Float,
        var longitude: Float,
        var title: String,
        val label: String) {

    fun update(marker: Marker) {
        this.latitude = marker.latitude
        this.longitude = marker.longitude
        this.title = marker.title
    }

}

