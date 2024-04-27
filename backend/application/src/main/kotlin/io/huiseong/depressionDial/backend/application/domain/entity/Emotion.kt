package io.huiseong.depressionDial.backend.application.domain.entity

import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.DuplicateEmotionDataException

data class Emotion(
    val emotionType: EmotionType,
    val dailyDegrees: EmotionDailyDegrees = emptyList()
) {

}

typealias Emotions = List<Emotion>

fun Emotions.validDuplication(emotion: Emotion) {
    if (emotion in this) throw DuplicateEmotionDataException(emotion.emotionType)
}

fun Emotions.validDuplication(emotions: List<Emotion>) {
    emotions.forEach {
        if (it in this) throw DuplicateEmotionDataException(it.emotionType)
    }
}