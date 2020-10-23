package io.github.marcosstefani.nina.extensions

import io.github.marcosstefani.nina.runner.domain.Job
import org.springframework.scheduling.support.CronSequenceGenerator
import java.util.*

fun Job.eligible() : Boolean {
    val generator = CronSequenceGenerator("0 0 23 * * ?")
    val next = generator.next(Date())

    return next.sameMinute()
}