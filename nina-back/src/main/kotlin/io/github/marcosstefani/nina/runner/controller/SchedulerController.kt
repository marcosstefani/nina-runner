package io.github.marcosstefani.nina.runner.controller

import io.github.marcosstefani.nina.runner.service.SchedulerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigInteger

@RestController
@RequestMapping("scheduler")
class SchedulerController @Autowired constructor(
        private val schedulerService: SchedulerService
) {
    @PutMapping("/{id}/run")
    fun run(@PathVariable("id") id: BigInteger) {
        schedulerService.run(id)
    }
}