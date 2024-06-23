package io.huiseong.depressionDial.backend.application.port.`in`.usecase.emotion

import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotion
import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotions

interface FindEmotionUseCase {
    // === findAll ===
    fun findAllByNegativeEventId(negativeEventId: Long): Emotions

    // === find ===
    fun findById(id: Long): Emotion
}