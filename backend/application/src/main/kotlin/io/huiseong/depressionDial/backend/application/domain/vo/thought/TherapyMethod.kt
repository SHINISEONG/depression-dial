package io.huiseong.depressionDial.backend.application.domain.vo.thought

sealed class TherapyMethod

data class PositiveReframing(
    val positiveSide: String,
) : TherapyMethod()