package io.huiseong.depressionDial.backend.application.domain.entity.thought

import io.huiseong.depressionDial.backend.application.domain.enums.TherapyType
import io.huiseong.depressionDial.backend.application.domain.vo.thought.TherapyMethod
import java.time.LocalDateTime

data class Therapy(
    val id: TherapyId = 0,
    val therapyType: TherapyType,
    val therapyMethod: TherapyMethod,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

typealias TherapyId = Long
typealias Therapies = List<Therapy>