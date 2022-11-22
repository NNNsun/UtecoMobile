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

    private fun printDown(word: String, currentSquare: Boolean): String {
        var mapWord = SpecialSymbols.INIT.word
        when {
            word == "U" -> mapWord = SpecialSymbols.BRACKET_BLANK.word
            word == "D" && currentSquare -> mapWord = "[ ${makeHit(currentSquare)} ]"
            word == "D" && !currentSquare -> mapWord = "[ ${makeHit(currentSquare)} ]"
        }
        return mapWord
    }

    private fun cutExtra(words: String) {
        val newWords = words.replace(SpecialSymbols.EXTRA_BRACKET.word, SpecialSymbols.DIVIDER.word)
            .replace(SpecialSymbols.PLUS.word, "\n")
        println(newWords)
    }

    fun printMap(currentBridge: List<String>, currentSquare: List<Boolean>) {
        var words = SpecialSymbols.INIT.word
        for (i in currentBridge.indices) words += printUp(currentBridge[i], currentSquare[i])
        words += SpecialSymbols.PLUS.word
        for (i in currentBridge.indices) words += printDown(currentBridge[i], currentSquare[i])
        cutExtra(words)
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