package io.huiseong.depressionDial.backend.application.domain.entity

import java.time.LocalDateTime

data class EmotionDailyDegree(
    val current: Int,
    val goal: Int,
    val after: Int,
    val createdAt: LocalDateTime
)

typealias EmotionDailyDegrees = List<EmotionDailyDegree>