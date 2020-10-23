package io.github.marcosstefani.nina.extensions

import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.*

fun LocalDateTime?.format(format: String): String? {
    val formatter = DateTimeFormatter.ofPattern(format)
    return this?.format(formatter)
}