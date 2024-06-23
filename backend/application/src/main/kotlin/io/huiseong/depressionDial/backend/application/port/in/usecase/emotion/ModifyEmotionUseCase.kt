package io.huiseong.depressionDial.backend.application.port.`in`.usecase.emotion

import io.huiseong.depressionDial.backend.application.port.`in`.command.emotion.AddEmotionDailyDegreeCommand

interface ModifyEmotionUseCase {
    fun addDailyDegree(addEmotionDailyDegreeCommand: AddEmotionDailyDegreeCommand)
}