package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.thought.PositiveThougths
import io.huiseong.depressionDial.backend.application.domain.entity.thought.Therapies
import io.huiseong.depressionDial.backend.application.domain.entity.thought.ThoughtDailyDegrees
import io.huiseong.depressionDial.backend.application.domain.enums.CognitiveDistortionTypes
import java.time.LocalDateTime

data class NegativeThought(
    val id: Long = 0,
    val negativeEventId: Long,
    val thought: String,
    val therapies: Therapies = emptyList(),
    val positiveThoughts: PositiveThougths = emptyList(),
    val dailyDegrees: ThoughtDailyDegrees = emptyList(),
    val cognitiveDistortions: CognitiveDistortionTypes = emptyList(),
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

typealias NegativeThoughts = List<NegativeThought>