package io.huiseong.depressionDial.backend.application.port.`in`.command.emotion

data class PostEmotionCommand(
    val negativeEventId: Long,
    val emotionType: String
)