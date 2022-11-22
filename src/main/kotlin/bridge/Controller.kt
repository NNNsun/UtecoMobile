package bridge

class Controller {
    fun writeMoving(): String {
        return InputView().readMoving()
    }

    fun writeGameCommand(): String {
        return InputView().readGameCommand()
    }

    fun doneGame(size: Int, countTry: Int) {
        when (size) {
            0 -> println(Comment.GameComment.WIN.message + Result.SUCCESS.word)
            else -> println(Comment.GameComment.WIN.message + Result.FAIL.word)
        }
        println(Comment.GameComment.COUNT.message + countTry)
    }

    fun readCurrent(currentBridge: List<String>, currentSquare: List<Boolean>) {
        OutputView().printMap(currentBridge, currentSquare)
    }

    fun readResult(currentBridge: List<String>, currentSquare: List<Boolean>) {
        println(Comment.GameComment.RESULT.message)
        OutputView().printResult(currentBridge, currentSquare)
    }

    enum class Result(val word: String) {
        SUCCESS("성공"),
        FAIL("실패"),
    }
}