package de.zeilush.timetracker.location

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.PersistenceConstructor
import java.util.*

/**
 * Created by zeilush on 6/19/17.
 */
@Document(collection = "marker")
data class MarkerDto @PersistenceConstructor constructor(
        @Id var id: UUID? = null,
        val userId: String,
        var latitude: Float,
        var longitude: Float,
        var title: String,
        var label: String)