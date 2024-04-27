package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.Emotion
import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.DuplicateEmotionDataException
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

val negativeEvent = NegativeEvent(
    id = 0,
    content = "아주 부정적이었던 사건",
    userId = "user01",
    emotions = listOf(Emotion(EmotionType.GUILTY))
)

class NegativeEventTest : StringSpec({
    "fun addEmotion()" should {
        "기존에 없는 감정을 emotions에 추가 시킨다" {
            val emotion = Emotion(EmotionType.ANGER)
            val modifiedEvent = negativeEvent.addEmotion(emotion)
            modifiedEvent.emotions shouldBe listOf(Emotion(EmotionType.GUILTY), Emotion(EmotionType.ANGER))
        }
        "이미 존재하는 감정이 입력되면 EmotionDuplicateEception을 발생시켜야 한다." {
            try {
                negativeEvent.addEmotion(Emotion(EmotionType.GUILTY))
            } catch (e: Exception) {
                (e is DuplicateEmotionDataException) shouldBe true
            }
        }
    }

    "fun addEmotions()" should {
        "기존에 없는 감정들을 emotions에 추가 시킨다" {
            val emotions = listOf(Emotion(EmotionType.ANGER), Emotion(EmotionType.EMBARRASSMENT))
            val actual = negativeEvent.addEmotions(emotions).emotions
            val expected = listOf(
                Emotion(EmotionType.GUILTY),
                Emotion(EmotionType.ANGER),
                Emotion(EmotionType.EMBARRASSMENT)
            )
            actual shouldBe expected
        }
    }

})