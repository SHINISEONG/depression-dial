package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import java.time.LocalDateTime

data class EmotionPositiveReframing(
    val id: EmotionPositiveReframingId = 0,
    val emotionId: EmotionId,
    val positiveSide: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
) {
    fun update(
        positiveSide: String = this.positiveSide,
    ) = copy(
        positiveSide = positiveSide,
    )
}

typealias EmotionPositiveReframingId = Long
typealias EmotionPositiveReframings = List<EmotionPositiveReframing>