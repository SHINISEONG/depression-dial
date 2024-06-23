package io.huiseong.depressionDial.backend.application.domain.entity.emotion

import java.time.LocalDateTime

data class EmotionDailyDegree(
    val id: EmotionDailyDegreeId = 0L,
    val emotionId: EmotionId,
    val current: Int,
    val goal: Int,
    val after: Int = 0,
    val createdAt: LocalDateTime
) {
    fun update(
        current: Int = this.current,
        goal: Int = this.goal,
        after: Int = this.after
    ) = copy(
        current = current,
        goal = goal,
        after = after
    )
}

typealias EmotionDailyDegreeId = Long
typealias EmotionDailyDegrees = List<EmotionDailyDegree>