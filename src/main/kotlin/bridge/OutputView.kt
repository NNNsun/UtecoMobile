package bridge

class OutputView {
    fun printGameStart() {
        println(Comment.GameComment.START.message)
    }
    private fun makeHit(currentSquare: Boolean): String {
        val hit = when (currentSquare) {
            true -> SpecialSymbols.ANSWER.word
            false -> SpecialSymbols.MISTAKE.word
        }
        return hit
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