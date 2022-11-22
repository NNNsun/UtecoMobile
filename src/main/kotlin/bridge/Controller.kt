package bridge

class Controller {
    fun writeMoving(): String {
        return InputView().readMoving()
    }
    fun writeGameCommand(): String {
        return InputView().readGameCommand()
    }
}