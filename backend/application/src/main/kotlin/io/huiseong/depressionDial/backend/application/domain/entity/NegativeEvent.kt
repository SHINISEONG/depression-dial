package io.huiseong.depressionDial.backend.application.domain.entity

import io.huiseong.depressionDial.backend.application.domain.enums.NegativeEventType
import java.time.LocalDateTime

data class NegativeEvent(
    val id: Long,
    val content: String,
    val userId: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val type: NegativeEventType = NegativeEventType.NORMAL
)
