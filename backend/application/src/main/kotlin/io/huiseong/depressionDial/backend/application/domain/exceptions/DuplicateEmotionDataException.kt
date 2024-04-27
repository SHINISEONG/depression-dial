package io.huiseong.depressionDial.backend.application.domain.exceptions

import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.common.DuplicateDataException

class DuplicateEmotionDataException(emotionType: EmotionType) :
    DuplicateDataException("emotion type $emotionType(${emotionType.value}) is duplicated")