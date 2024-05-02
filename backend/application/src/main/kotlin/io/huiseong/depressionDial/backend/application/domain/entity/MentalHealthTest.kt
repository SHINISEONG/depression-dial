package io.huiseong.depressionDial.backend.application.domain.entity

import io.huiseong.depressionDial.backend.application.domain.enums.MentalHealthTestType
import java.time.LocalDateTime

data class MentalHealthTest(
    val id: MentalHealthTestId = 0,
    val userId: UserStringId,
    val testType: MentalHealthTestType,
    val questionNo: Int,
    val score: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
)

typealias MentalHealthTestId = Long
typealias MentalHealthTests = List<MentalHealthTest>