package io.huiseong.depressionDial.backend.application.domain.enums

enum class CognitiveDistortionType(val value: Int) {
    ALL_OR_NOTHING(0),
    OVER_GENERALIZATION(1),
    MENTAL_FILTER(3),
    DISQUALIFYING_THE_POSITIVE(4),
    JUMPING_TO_CONCLUSIONS(5),
    MIND_READING(6),
    FORTUNE_TELLING_DESPAIR(7),
    FORTUNE_TELLING_UNREST(8),
    MAGNIFICATION_AND_MINIMIZATION(9),
    EMOTIONAL_REASONING(10),
    SHOULD_STATEMENTS(11),
    SELF_DIRECTED(12),
    OTHERS_DIRECTED(13),
    WORLD_DIRECTED(14),
    HIDDEN(15),
    LABELING(16),
    BLAME(17),
    SELF_BLAME(18),
    OTHER_BLAME(19),
    ;

    companion object {
        fun from(value: Int): CognitiveDistortionType {
            return entries.first { it.value == value }
        }
    }
}

typealias CognitiveDistortionTypes = List<CognitiveDistortionType>