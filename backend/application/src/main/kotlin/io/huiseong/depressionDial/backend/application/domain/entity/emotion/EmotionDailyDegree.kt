package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import java.time.LocalDateTime

data class EmotionDailyDegree(
    val id: Long = 0,
    val current: Int,
    val goal: Int,
    val after: Int,
    val createdAt: LocalDateTime
)

typealias EmotionDailyDegrees = List<EmotionDailyDegree>