package de.zeilush.timetracker.location

import de.zeilush.timetracker.timesheet.TimesheetCW
import de.zeilush.timetracker.timesheet.calendarweek.TimesheetService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by zeilush on 6/19/17.
 */
@RestController
@RequestMapping("/timesheet/{userId}")
class TimesheetCWController(val timesheetCWRepo: TimesheetCWRepository, val timesheetService: TimesheetService) {

    @GetMapping("/{year}/{cw}")
    fun getTimesheetByCWAndYear(@PathVariable("userId") userId: String,
                                @PathVariable("cw") cw: Int,
                                @PathVariable("year") year: Int): List<TimesheetCW> {
        return timesheetService.findByUserIdCWYear(userId, cw, year);
    }

    @PutMapping
    fun updateTimesheet(@RequestBody request: TimesheetCW): TimesheetCW {

        return timesheetService.update(request);
    }
}