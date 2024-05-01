package io.huiseong.depressionDial.backend.application.domain.entity.thought

import java.time.LocalDateTime

data class PositiveThought(
    val id: Long = 0,
    val thought: String,
    val trust: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

typealias PositiveThougths = List<PositiveThought>
