package de.zeilush.timetracker.timesheet

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * Created by zeilush on 7/1/17.
 */
@Document(collection = "timesheetCW")
data class TimesheetCW @PersistenceConstructor constructor(
        @Id val id: UUID? = null,
        val userId: String,
        val cw: Int,
        val day: Int,
        val year: Int,
        var interruption: Int,
        var start: Double,
        var end: Double,
        var total: Double) {

    fun update(cw: TimesheetCW) {
        this.interruption = cw.interruption;
        this.start = cw.start;
        this.end = cw.end;
    }
}