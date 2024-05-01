package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.DuplicateEmotionException

data class Emotion(
    val id: Long = 0,
    val emotionType: EmotionType,
    val dailyDegrees: EmotionDailyDegrees = emptyList(),
    val emotionPositiveReframings: EmotionPositiveReframings = emptyList()
) {
    fun addDailyDegree(emotionDailyDegree: EmotionDailyDegree) =
        copy(dailyDegrees = dailyDegrees + emotionDailyDegree)

    fun addEmotionPositiveReframing(emotionPositiveReframing: EmotionPositiveReframing) =
        copy(emotionPositiveReframings = emotionPositiveReframings + emotionPositiveReframing)

}

typealias Emotions = List<Emotion>

fun Emotions.validDuplication(emotion: Emotion) {
    if (emotion in this) throw DuplicateEmotionException(emotion.emotionType)
}

fun Emotions.validDuplication(emotions: List<Emotion>) {
    emotions.forEach {
        if (it in this) throw DuplicateEmotionException(it.emotionType)
    }
}