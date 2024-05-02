package io.huiseong.depressionDial.backend.application.port.`in`.usecase.emotion

interface DeleteEmotionUseCase {
    fun deleteById(id: Long)
}