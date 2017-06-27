package de.zeilush.timetracker

import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by zeilush on 6/26/17.
 */
@Repository
interface LocationRepository : MongoRepository<LocationDto, String>