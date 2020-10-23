package io.github.marcosstefani.nina.runner.domain

import java.math.BigInteger
import javax.persistence.*

@Entity
data class Job (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: BigInteger,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        val cron: String,

        val active: Boolean = true,

        val running: Boolean = false
)