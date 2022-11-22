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
    private fun printUp(word: String, currentSquare: Boolean): String {
        var mapWord = SpecialSymbols.INIT.word
        when {
            word == "U" && currentSquare -> mapWord = "[ ${makeHit(currentSquare)} ]"
            word == "U" && !currentSquare -> mapWord = "[ ${makeHit(currentSquare)} ]"
            word == "D" -> mapWord = SpecialSymbols.BRACKET_BLANK.word
        }
        return mapWord
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