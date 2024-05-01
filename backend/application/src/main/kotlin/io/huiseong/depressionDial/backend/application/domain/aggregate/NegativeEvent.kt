package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotion
import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotions
import io.huiseong.depressionDial.backend.application.domain.entity.emotion.validDuplication
import io.huiseong.depressionDial.backend.application.domain.entity.thought.NegativeThoughts
import io.huiseong.depressionDial.backend.application.domain.enums.NegativeEventType
import io.huiseong.depressionDial.backend.application.domain.exceptions.DuplicateEmotionException
import java.time.LocalDateTime

data class NegativeEvent(
    val id: Long,
    val content: String,
    val userId: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val type: NegativeEventType = NegativeEventType.NORMAL,
    val emotions: Emotions = emptyList(),
    val thoughts: NegativeThoughts = emptyList()
) {
    init {
        require(content.isNotEmpty()) { "content must not be empty" }
        require(emotions.size == emotions.distinctBy { it.emotionType }.size) { throw DuplicateEmotionException() }
    }

    fun addEmotion(emotion: Emotion): NegativeEvent {
        emotions.validDuplication(emotion)
        return copy(emotions = emotions + emotion)
    }

    fun addEmotions(emotions: Emotions): NegativeEvent {
        val distinctEmotions = emotions.distinctBy { it.emotionType }
        this.emotions.validDuplication(distinctEmotions)
        return copy(emotions = this.emotions + distinctEmotions)
    }

    fun update(
        content: String = this.content,
        type: NegativeEventType = this.type,
        emotions: Emotions = this.emotions
    ) = copy(content = content, updatedAt = LocalDateTime.now(), type = type, emotions = emotions)
}


typealias NegativeEvents = List<NegativeEvent>