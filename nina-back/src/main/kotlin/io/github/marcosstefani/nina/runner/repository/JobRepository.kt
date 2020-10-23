package io.github.marcosstefani.nina.runner.repository

import io.github.marcosstefani.nina.runner.domain.Job
import org.springframework.data.jpa.repository.JpaRepository
import java.math.BigInteger
import java.util.*

interface JobRepository: JpaRepository<Job, BigInteger> {
    fun findByActiveTrueAndRunningFalse(): List<Job>?
}