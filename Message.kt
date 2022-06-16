package processor

enum class Message(val message: String) {
    ERROR("ERROR"),
    MENU("1. Add matrices\n" +
            "2. Multiply matrix by a constant\n" +
            "3. Multiply matrices\n" +
            "0. Exit"),
    ENTER_CONSTANT("Enter constant"),
    RESULT("The result is:")
}