package io.huiseong.depressionDial.backend.application.enums

import io.huiseong.depressionDial.backend.application.domain.enums.ValuedEnum
import io.huiseong.depressionDial.backend.application.domain.enums.toValuedEnum

typealias TestEnumCode = Int

enum class TestValuedEnum(override val value: TestEnumCode) : ValuedEnum<TestEnumCode> {
    A(1),
    B(2),
    C(3)
}

fun TestEnumCode.toTestValuedEnum(): TestValuedEnum {
    return this.toValuedEnum()
}