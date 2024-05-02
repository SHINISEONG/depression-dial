package io.huiseong.depressionDial.backend.application.port.`in`.usecase.emotion

import io.huiseong.depressionDial.backend.application.domain.aggregate.Emotion
import io.huiseong.depressionDial.backend.application.domain.aggregate.Emotions

interface FindEmotionUseCase {
    // === findAll ===
    fun findAllByNegativeEventId(negativeEventId: Long): Emotions

    // === find ===
    fun findById(id: Long): Emotion
}