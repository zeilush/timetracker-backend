package de.zeilush.timetracker.location

import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

/**
 * Created by zeilush on 6/26/17.
 */
@Repository
interface MarkerRepository : MongoRepository<MarkerDto, UUID>