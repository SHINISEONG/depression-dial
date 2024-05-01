package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import java.time.LocalDateTime

data class EmotionPositiveReframing(
    val id: Long = 0,
    val positiveSide: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)

typealias EmotionPositiveReframings = List<EmotionPositiveReframing>