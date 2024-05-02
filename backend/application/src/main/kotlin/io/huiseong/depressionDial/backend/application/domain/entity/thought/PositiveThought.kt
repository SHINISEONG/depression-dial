package io.huiseong.depressionDial.backend.application.domain.entity.thought

import java.time.LocalDateTime

data class PositiveThought(
    val id: PositiveThoughtId = 0,
    val thought: String,
    val trust: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

typealias PositiveThoughtId = Long
typealias PositiveThoughts = List<PositiveThought>
