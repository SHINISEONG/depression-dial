package io.huiseong.depressionDial.backend.application.domain.enums

import io.huiseong.depressionDial.backend.application.domain.exceptions.common.InvalidEnumValueException

interface ValuedEnum<T> {
    val value: T
}

inline fun <ValueT, reified EnumT> fromValue(value: ValueT): EnumT where EnumT : ValuedEnum<ValueT> {
    return EnumT::class.java.enumConstants.firstOrNull { it.value == value }
        ?: throw InvalidEnumValueException(EnumT::class.java.simpleName, value)
}

inline fun <ValueT, reified EnumT> ValueT.toValuedEnum(): EnumT where EnumT : ValuedEnum<ValueT> {
    return fromValue<ValueT, EnumT>(this)
}