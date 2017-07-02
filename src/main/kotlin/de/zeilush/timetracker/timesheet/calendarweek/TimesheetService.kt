package de.zeilush.timetracker.timesheet.calendarweek

import de.zeilush.timetracker.location.TimesheetCWRepository
import de.zeilush.timetracker.timesheet.TimesheetCW
import org.springframework.stereotype.Service
import java.util.*

/**
 * Created by zeiler on 7/2/17.
 */
@Service
class TimesheetService(val timesheetCWRepo: TimesheetCWRepository) {

    fun findByUserIdCWYear(userId: String, cw: Int,year: Int): List<TimesheetCW> {
        var result = timesheetCWRepo.findByUserIdAndCwAndYearOrderByDay(userId, cw, year);

        //create empty entries
        if(result.isEmpty()) {
            result = mutableListOf<TimesheetCW>()

            val cal = Calendar.getInstance(Locale.GERMANY);

            cal.set(Calendar.WEEK_OF_YEAR, cw);
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek())

            for (day in 1..7) {
                val timesheet = TimesheetCW(UUID.randomUUID(), userId, cw, day, year, 0, 0.0, 0.0, 0.0);

                timesheetCWRepo.save(timesheet);

                result.add(timesheet);

                cal.add(Calendar.DATE, 1)
            }
        }

        return result;
    }

    fun update(timesheet: TimesheetCW): TimesheetCW {
        return timesheetCWRepo.save(timesheet);
    }
}