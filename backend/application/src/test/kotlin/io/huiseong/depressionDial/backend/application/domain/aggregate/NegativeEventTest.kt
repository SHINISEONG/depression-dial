package io.huiseong.depressionDial.backend.application.domain.aggregate

import io.huiseong.depressionDial.backend.application.domain.entity.emotion.Emotion
import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.DuplicateEmotionException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

val negativeEvent = NegativeEvent(
    id = 0,
    content = "아주 부정적이었던 사건",
    userId = "user01",
    emotions = listOf(Emotion(emotionType = EmotionType.GUILTY))
)

class NegativeEventTest : StringSpec({
    "NegativeEvent()" should {
        "emotions에 중복이 있으면 예외를 발생시킨다." {
            shouldThrow<DuplicateEmotionException> {
                NegativeEvent(
                    id = 0,
                    content = "꽤 부정적이었던 사건",
                    userId = "user01",
                    emotions = listOf(
                        Emotion(emotionType = EmotionType.GUILTY),
                        Emotion(emotionType = EmotionType.GUILTY)
                    )
                )
            }
        }
        "content의 내용이 null string이면 예외를 발생시킨다." {
            shouldThrow<IllegalArgumentException> {
                NegativeEvent(
                    id = 0,
                    content = "",
                    userId = "user01",
                    emotions = listOf(
                        Emotion(emotionType = EmotionType.GUILTY),
                    )
                )
            }
        }
    }
    "fun addEmotion()" should {
        "기존에 없는 감정을 emotions에 추가 시킨다" {
            val emotion = Emotion(emotionType = EmotionType.ANGER)
            val modifiedEvent = negativeEvent.addEmotion(emotion)
            modifiedEvent.emotions shouldBe listOf(
                Emotion(emotionType = EmotionType.GUILTY),
                Emotion(emotionType = EmotionType.ANGER)
            )
        }
        "이미 존재하는 감정이 입력되면 EmotionDuplicateEception을 발생시켜야 한다." {
            val emotion = Emotion(emotionType = EmotionType.GUILTY)
            shouldThrow<DuplicateEmotionException> {
                negativeEvent.addEmotion(emotion)
            }
        }
    }

    "fun addEmotions()" should {
        "기존에 없는 감정들을 emotions에 추가 시킨다" {
            val emotions =
                listOf(Emotion(emotionType = EmotionType.ANGER), Emotion(emotionType = EmotionType.EMBARRASSMENT))
            val actual = negativeEvent.addEmotions(emotions).emotions
            val expected = listOf(
                Emotion(emotionType = EmotionType.GUILTY),
                Emotion(emotionType = EmotionType.ANGER),
                Emotion(emotionType = EmotionType.EMBARRASSMENT)
            )
            actual shouldBe expected
        }
        "입력되는 감정들의 중복을 제거한 후 emotions에 추가시킨다." {
            val emotions =
                listOf(
                    Emotion(emotionType = EmotionType.ANGER),
                    Emotion(emotionType = EmotionType.EMBARRASSMENT),
                    Emotion(emotionType = EmotionType.EMBARRASSMENT)
                )

            val actual = negativeEvent.addEmotions(emotions).emotions
            val expected = listOf(
                Emotion(emotionType = EmotionType.GUILTY),
                Emotion(emotionType = EmotionType.ANGER),
                Emotion(emotionType = EmotionType.EMBARRASSMENT)
            )
            actual shouldBe expected
        }
        "입력 되는 감정들 중 기존 emotions에 있는 type이 존재한다면 예외를 발생시킨다." {
            val emotions =
                listOf(
                    Emotion(emotionType = EmotionType.GUILTY),
                    Emotion(emotionType = EmotionType.ANGER),
                    Emotion(emotionType = EmotionType.EMBARRASSMENT),
                )
            shouldThrow<DuplicateEmotionException> { negativeEvent.addEmotions(emotions).emotions }
        }
    }

})