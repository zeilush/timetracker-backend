package de.zeilush.timetracker.config

/**
 * Created by wkss on 6/27/17.
 */
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
 * Created by wkss on 6/27/17.
 */
@Configuration
open class ObjectMapperConfiguration {
    @Bean
    @Primary
    open fun objectMapper() = ObjectMapper().apply {
        registerModule(KotlinModule())
    }
}