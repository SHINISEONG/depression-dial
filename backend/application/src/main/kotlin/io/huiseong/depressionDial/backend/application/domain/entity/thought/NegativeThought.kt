package io.huiseong.depressionDial.backend.application.domain.entity.thought

import io.huiseong.depressionDial.backend.application.domain.enums.CognitiveDistortionTypes
import java.time.LocalDateTime

data class NegativeThought(
    val id: Long = 0,
    val thought: String,
    val positiveThoughts: PositiveThougths,
    val dailyDegrees: ThoughtDailyDegrees,
    val cognitiveDistortions: CognitiveDistortionTypes = emptyList(),
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

typealias NegativeThoughts = List<NegativeThought>