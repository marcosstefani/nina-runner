package io.github.marcosstefani.nina.runner.service

import io.github.marcosstefani.nina.extensions.eligible
import io.github.marcosstefani.nina.runner.repository.JobRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SchedulerService @Autowired constructor(
        private val jobRepository: JobRepository
) {
    private val log: Logger = LoggerFactory.getLogger(SchedulerService::class.java)

    fun runner() {
        val jobs = jobRepository.findByActiveTrueAndRunningFalse()
        jobs?.also {
            it.forEach {
                if (it.eligible()) {
                    log.info("job ${it.name} / ${it.cron}")
                }
            }
        }
    }
}