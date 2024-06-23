package io.huiseong.depressionDial.backend.application.port.`in`.usecase.emotion

import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotion
import io.huiseong.depressionDial.backend.application.port.`in`.command.emotion.PostEmotionCommand

interface PostEmotionUseCase {
    fun postEmotion(postEmotionCommand: PostEmotionCommand): Emotion
}