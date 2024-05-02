package io.huiseong.depressionDial.backend.application.enums

import io.huiseong.depressionDial.backend.application.domain.enums.fromValue
import io.huiseong.depressionDial.backend.application.domain.enums.toValuedEnum
import io.huiseong.depressionDial.backend.application.domain.exceptions.common.InvalidEnumValueException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class ValuedEnumTest : StringSpec({
    "from()" should {
        "value에 해당하는 enum을 반환한다." {
            val value = 1
            val actualEnum = fromValue<Int, TestValuedEnum>(value)
            actualEnum shouldBe TestValuedEnum.A
        }

        "value에 해당하는 enum이 없으면 예외를 발생시킨다." {
            val value = 0
            val exception = shouldThrow<InvalidEnumValueException> {
                fromValue<Int, TestValuedEnum>(value)
            }
            exception.message shouldBe "Invalid value for enum class. TestValuedEnum (value: 0)"
        }
    }

    "toValuedEnum()" should {
        "value에 해당하는 enum을 반환한다.(확장함수)" {
            val value = 1
            val actualEnum = value.toValuedEnum<Int, TestValuedEnum>()
            actualEnum shouldBe TestValuedEnum.A
        }
        "value에 해당하는 enum을 반환한다. (특정 Enum에 대한 확장함수)" {
            val value = 1
            val actualEnum = value.toTestValuedEnum()
            actualEnum shouldBe TestValuedEnum.A
        }
        "value에 해당하는 enum이 없으면 예외를 발생시킨다.(확장함수)" {
            val value = 0
            val exception = shouldThrow<InvalidEnumValueException> {
                value.toValuedEnum<Int, TestValuedEnum>()
            }
            exception.message shouldBe "Invalid value for enum class. TestValuedEnum (value: 0)"
        }

    }
})