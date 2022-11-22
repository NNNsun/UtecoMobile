package bridge

class BridgeGame (val bridge: List<String>){
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

    private fun clearAnswer() {
        myPicks.clear()
        bridgeAnswer.clear()
    }

    fun move(currentBridge: List<String>) {
        when {
            currentBridge.isNotEmpty() -> {findAnswer(currentBridge, Controller().writeMoving())}
            currentBridge.isEmpty() -> {}
        }
    }
    private fun findAnswer(currentBridge: List<String>, myPick: String) {
        if (currentBridge[0] == myPick) {
        } else {
            addAnswer(myPick, false)
        }
    }
    private fun updateBridge(bridgeMaker: List<String>, myPick: String) {
        var newBridge = bridgeMaker.toMutableList()
        newBridge.removeAt(0)
        addAnswer(myPick, true)
        return move(newBridge)
    }

    fun retry(bridgeMaker: List<String>) {
        when (Controller().writeGameCommand()) {
            "R" -> { countTry++;clearAnswer()}
            "Q" -> {Controller().doneGame(bridgeMaker.size, countTry)}
        }
    }
}
