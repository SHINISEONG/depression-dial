package io.huiseong.depressionDial.backend.application.port.`in`.command.emotion

import io.huiseong.depressionDial.backend.application.domain.entity.emotion.EmotionDailyDegree
import io.huiseong.depressionDial.backend.application.domain.entity.emotion.EmotionId

data class AddEmotionDailyDegreeCommand(
    val emotionId: EmotionId,
    val dailyDegree: EmotionDailyDegree
)