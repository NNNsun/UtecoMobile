package bridge

class Controller {
    fun writeMoving(): String {
        return InputView().readMoving()
    }
    fun writeGameCommand(): String {
        return InputView().readGameCommand()
    }
    enum class Result(val word: String) {
        SUCCESS("성공"),
        FAIL("실패"),
    }
}