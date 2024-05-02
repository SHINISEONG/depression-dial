package io.huiseong.depressionDial.backend.application.domain.entity.thought

import java.time.LocalDateTime

data class ThoughtDailyDegree(
    val id: ThoughtDailyDegreeId = 0,
    val current: Int,
    val after: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)

typealias ThoughtDailyDegreeId = Long
typealias ThoughtDailyDegrees = List<ThoughtDailyDegree>
