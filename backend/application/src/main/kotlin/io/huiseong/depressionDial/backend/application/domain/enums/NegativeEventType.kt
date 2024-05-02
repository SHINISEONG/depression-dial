package io.huiseong.depressionDial.backend.application.domain.enums

typealias NegativeEventTypeCode = Int

enum class NegativeEventType(override val value: NegativeEventTypeCode) : ValuedEnum<NegativeEventTypeCode> {
    NORMAL(0),
    RELAPSE_PREVENTION(1)
    ;
}

fun NegativeEventTypeCode.toNegativeEventType(): NegativeEventType {
    return this.toValuedEnum()
}