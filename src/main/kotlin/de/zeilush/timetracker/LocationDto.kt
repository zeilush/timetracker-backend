package de.zeilush.timetracker

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.PersistenceConstructor

/**
 * Created by zeilush on 6/19/17.
 */
@Document(collection = "locations")
data class LocationDto @PersistenceConstructor constructor(
        @Id val id: String? = null, //default parameter value requires @PersistenceConstructor
        val userId: String,
        val latitude: Float,
        val longitude: Float,
        val title: String,
        val label: String)