package de.zeilush.timetracker.location

import de.zeilush.timetracker.timesheet.TimesheetCW
import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

/**
 * Created by zeilush on 6/26/17.
 */
@Repository
interface TimesheetCWRepository : MongoRepository<TimesheetCW, String> {
    fun  findByUserIdAndCwAndYearOrderByDay(userId: String, cw: Int, year: Int): List<TimesheetCW>
}