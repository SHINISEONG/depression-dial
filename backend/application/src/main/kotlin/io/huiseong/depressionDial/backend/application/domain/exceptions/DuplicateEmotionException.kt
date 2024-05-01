package io.huiseong.depressionDial.backend.application.domain.exceptions

import io.huiseong.depressionDial.backend.application.domain.enums.EmotionType
import io.huiseong.depressionDial.backend.application.domain.exceptions.common.DuplicateDataException

class DuplicateEmotionException(emotionType: EmotionType? = null) :
    DuplicateDataException(
        if (emotionType == null)
            "emotion type is duplicated"
        else
            "emotion type $emotionType(${emotionType.value}) is duplicated"
    )