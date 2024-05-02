package io.huiseong.depressionDial.backend.application.domain.entity

import io.huiseong.depressionDial.backend.application.domain.enums.GenderType
import java.time.LocalDate
import java.time.LocalDateTime

data class User(
    val id: UserId = 0,
    val stringId: UserStringId,
    val password: String,
    val birth: LocalDate,
    val gender: GenderType,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
) {
    fun update(
        password: String = this.password,
        birth: LocalDate = this.birth,
        gender: GenderType = this.gender
    ) = copy(
        password = password,
        birth = birth,
        gender = gender,
        updatedAt = LocalDateTime.now()
    )

    fun update(user: User) = copy(
        password = user.password,
        birth = user.birth,
        gender = user.gender,
        updatedAt = LocalDateTime.now()
    )
}

typealias UserId = Long
typealias UserStringId = String
typealias Users = List<User>


