package io.huiseong.depressionDial.backend.application.domain.enums

enum class GenderType(override val value: Int) : ValuedEnum<Int> {
    MALE(0),
    FEMALE(1),
    OTHER(2)
}