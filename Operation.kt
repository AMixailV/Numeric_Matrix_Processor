package processor

enum class Operation(val operation: Int) {
    ADD(1),
    MULTIPLY_BY_CONSTANT(2),
    MULTIPLY_MATRICES(3),
    EXIT(0)
}