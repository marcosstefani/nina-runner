package io.github.marcosstefani.nina.runner.domain

import java.math.BigInteger
import javax.persistence.*

@Entity
data class Job (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: BigInteger,

        @Column(nullable = false)
        var name: String,

        @Column(nullable = false)
        var cron: String,

        var active: Boolean = true,

        var running: Boolean = false
)