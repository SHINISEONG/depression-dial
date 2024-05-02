package io.huiseong.depressionDial.backend.application.domain.entity

import io.huiseong.depressionDial.backend.application.domain.enums.NegativeEventType
import java.time.LocalDateTime

data class NegativeEvent(
    val id: NegativeEventId = 0L,
    val content: String,
    val userId: UserStringId,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val type: NegativeEventType = NegativeEventType.NORMAL,

    ) {
    fun update(
        content: String = this.content,
        type: NegativeEventType = this.type,
    ) = copy(content = content, updatedAt = LocalDateTime.now(), type = type)
}

typealias NegativeEventId = Long
typealias NegativeEvents = List<NegativeEvent>