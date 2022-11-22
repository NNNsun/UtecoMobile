package bridge

class OutputView {
    fun printGameStart() {
        println(Comment.GameComment.START.message)
    }
    fun printMap() {}

    fun printResult() {}
}
enum class SpecialSymbols(val word: String) {
    ANSWER("O"),
    MISTAKE("X"),
    BRACKET_BLANK("[   ]"),
    EXTRA_BRACKET("]["),
    INIT(""),
    DIVIDER("|"),
    PLUS("+")
}