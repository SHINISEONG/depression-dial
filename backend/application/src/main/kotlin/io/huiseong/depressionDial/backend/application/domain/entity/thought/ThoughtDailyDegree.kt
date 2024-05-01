package io.huiseong.depressionDial.backend.application.domain.entity.thought

import java.time.LocalDateTime

data class ThoughtDailyDegree(
    val id: Long = 0,
    val current: Int,
    val after: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)

typealias ThoughtDailyDegrees = List<ThoughtDailyDegree>
