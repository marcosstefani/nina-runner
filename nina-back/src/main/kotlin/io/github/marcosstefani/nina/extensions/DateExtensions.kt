package io.github.marcosstefani.nina.extensions

import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

fun Date.sameMinute(): Boolean {
    val now = LocalDateTime.ofInstant(Date().toInstant(), ZoneOffset.UTC)
    val value = LocalDateTime.ofInstant(this.toInstant(), ZoneOffset.UTC)

    return (value.year == now.year && value.month == now.month && value.dayOfMonth == now.dayOfMonth && value.hour == now.hour && value.minute == now.minute)
}