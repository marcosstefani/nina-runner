package io.github.marcosstefani.nina.runner

import io.github.marcosstefani.nina.runner.service.SchedulerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
@EnableAsync
class Scheduler @Autowired constructor(
        private val service: SchedulerService
) {
    @Async
    @Scheduled(cron = "0 * * ? * *")
    @Throws(InterruptedException::class)
    fun scheduledRunner() {
        service.runner()
    }
}