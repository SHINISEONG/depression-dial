package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.Emotion
import io.huiseong.depressionDial.backend.application.domain.entity.Emotions
import io.huiseong.depressionDial.backend.application.domain.entity.validDuplication
import io.huiseong.depressionDial.backend.application.domain.enums.NegativeEventType
import java.time.LocalDateTime

data class NegativeEvent(
    val id: Long,
    val content: String,
    val userId: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val type: NegativeEventType = NegativeEventType.NORMAL,
    val emotions: List<Emotion>
) {
    fun addEmotion(emotion: Emotion): NegativeEvent {
        emotions.validDuplication(emotion)
        return copy(emotions = emotions + emotion)
    }

    fun addEmotions(emotions: Emotions): NegativeEvent {
        emotions.distinct()
        this.emotions.validDuplication(emotions)
        return copy(emotions = this.emotions + emotions)
    }
}
