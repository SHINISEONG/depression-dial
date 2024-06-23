package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import io.huiseong.depressionDial.backend.application.domain.entity.NegativeEventId
import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType

data class Emotion(
    val id: EmotionId = 0,
    val negativeEventId: NegativeEventId,
    val emotionType: EmotionType,
    val dailyDegrees: EmotionDailyDegrees = emptyList(),
    val emotionPositiveReframings: EmotionPositiveReframings = emptyList()
) {
    fun addDailyDegree(emotionDailyDegree: EmotionDailyDegree) =
        copy(dailyDegrees = dailyDegrees + emotionDailyDegree)

    fun addEmotionPositiveReframing(emotionPositiveReframing: EmotionPositiveReframing) =
        copy(emotionPositiveReframings = emotionPositiveReframings + emotionPositiveReframing)

}
typealias EmotionId = Long
typealias Emotions = List<Emotion>