package io.huiseong.depressionDial.backend.application.domain.exceptions.common

class InvalidEnumValueException(enumClassName: String = "", value: Any? = null) :
    NoSuchElementException("Invalid value for enum class. $enumClassName ${if (value != null) "(value: $value)" else ""}")