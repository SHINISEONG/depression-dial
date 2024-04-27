package io.huiseong.depressionDial.backend.application.domain.entity

import java.time.LocalDate
import java.time.LocalDateTime

data class User(
    val id: Long,
    val stringId: String,
    val password: String,
    val birth: LocalDate,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)


