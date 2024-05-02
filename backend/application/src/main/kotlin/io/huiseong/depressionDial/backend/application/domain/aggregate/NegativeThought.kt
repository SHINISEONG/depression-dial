package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.NegativeEventId
import io.huiseong.depressionDial.backend.application.domain.entity.thought.*
import io.huiseong.depressionDial.backend.application.domain.enums.CognitiveDistortionType
import io.huiseong.depressionDial.backend.application.domain.enums.CognitiveDistortionTypes
import java.time.LocalDateTime

data class NegativeThought(
    val id: NegativeThoughtId = 0,
    val negativeEventId: NegativeEventId,
    val thought: String,
    val therapies: Therapies = emptyList(),
    val positiveThoughts: PositiveThoughts = emptyList(),
    val dailyDegrees: ThoughtDailyDegrees = emptyList(),
    val cognitiveDistortions: CognitiveDistortionTypes = emptyList(),
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
) {
    fun addTherapy(therapy: Therapy) =
        copy(therapies = therapies + therapy)

    fun addAllTherapies(therapies: Therapies) =
        copy(therapies = this.therapies + therapies)

    fun addPositiveThought(positiveThought: PositiveThought) =
        copy(positiveThoughts = positiveThoughts + positiveThought)

    fun addAllPositiveThoughts(positiveThoughts: PositiveThoughts) =
        copy(positiveThoughts = this.positiveThoughts + positiveThoughts)

    fun addDailyDegree(thoughtDailyDegree: ThoughtDailyDegree) =
        copy(dailyDegrees = dailyDegrees + thoughtDailyDegree)

    fun addAllDailyDegrees(thoughtDailyDegrees: ThoughtDailyDegrees) =
        copy(dailyDegrees = this.dailyDegrees + thoughtDailyDegrees)

    fun addCognitiveDistortion(cognitiveDistortion: CognitiveDistortionType) =
        copy(cognitiveDistortions = cognitiveDistortions + cognitiveDistortion)

    fun addAllCognitiveDistortions(cognitiveDistortions: CognitiveDistortionTypes) =
        copy(cognitiveDistortions = this.cognitiveDistortions + cognitiveDistortions)

    fun update(
        thought: String = this.thought,
        therapies: Therapies = this.therapies,
        positiveThoughts: PositiveThoughts = this.positiveThoughts,
        dailyDegrees: ThoughtDailyDegrees = this.dailyDegrees,
        cognitiveDistortions: CognitiveDistortionTypes = this.cognitiveDistortions,
    ) = copy(
        thought = thought,
        therapies = therapies,
        positiveThoughts = positiveThoughts,
        dailyDegrees = dailyDegrees,
        cognitiveDistortions = cognitiveDistortions,
        updatedAt = LocalDateTime.now(),
    )

    fun update(thought: NegativeThought) = copy(
        thought = thought.thought,
        therapies = thought.therapies,
        positiveThoughts = thought.positiveThoughts,
        dailyDegrees = thought.dailyDegrees,
        cognitiveDistortions = thought.cognitiveDistortions,
        updatedAt = LocalDateTime.now(),
    )
}

typealias NegativeThoughtId = Long
typealias NegativeThoughts = List<NegativeThought>