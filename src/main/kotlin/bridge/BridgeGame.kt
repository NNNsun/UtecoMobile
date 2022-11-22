package bridge

class BridgeGame {
    var countTry = 1
    var myPicks = mutableListOf<String>()
    var bridgeAnswer = mutableListOf<Boolean>()

    private fun addAnswer(bridgeSquare: String, guess: Boolean) {
        when (guess) {
            true -> {
                myPicks.add(bridgeSquare);bridgeAnswer.add(guess)
            }
            false -> {
                myPicks.add(bridgeSquare);bridgeAnswer.add(guess)
            }
        }
    }

    fun move(currentBridge: List<String>) {
        when {
            currentBridge.isNotEmpty() -> {}
            currentBridge.isEmpty() -> {}
        }
    }

    fun retry() {}
}
