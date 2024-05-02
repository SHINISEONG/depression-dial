package io.huiseong.depressionDial.backend.application.domain.enums

typealias EmotionCode = Int

enum class EmotionType(override val value: EmotionCode) : ValuedEnum<EmotionCode> {
    SADNESS(0),
    ANXIETY(1),
    GUILTY(2),
    INFERIORITY(3),
    LONELINESS(4),
    EMBARRASSMENT(5),
    DESPAIR(6),
    FRUSTRATION(7),
    ANGER(8),
    OTHER(9)
    ;
}