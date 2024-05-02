package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.NegativeEvent
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should

val negativeEvent = NegativeEvent(
    id = 0,
    content = "아주 부정적이었던 사건",
    userId = "user01",
)

class NegativeEventTest : StringSpec({
    "NegativeEvent()" should {
        "content의 내용이 null string이면 예외를 발생시킨다." {
            shouldThrow<IllegalArgumentException> {
                NegativeEvent(
                    id = 0,
                    content = "",
                    userId = "user01",
                )
            }
        }
    }
})