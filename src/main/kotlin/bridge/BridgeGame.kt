package bridge

class BridgeGame(val bridge: List<String>) {
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

    fun tryMove() {
        move(bridge)
    }

    fun move(currentBridge: List<String>) {
        when {
            currentBridge.isNotEmpty() -> {
                findAnswer(currentBridge, Controller().writeMoving())
            }
            currentBridge.isEmpty() -> {
                Controller().readResult(
                    myPicks,
                    bridgeAnswer
                );Controller().doneGame(currentBridge.size, countTry)
            }
        }
    }

    private fun findAnswer(currentBridge: List<String>, myPick: String) {
        if (currentBridge[0] == myPick) {
            updateBridge(currentBridge, myPick)
        } else {
            addAnswer(myPick, false)
            Controller().readCurrent(myPicks, bridgeAnswer)
            retry(currentBridge)
        }
    }

    private fun updateBridge(bridgeMaker: List<String>, myPick: String) {
        var newBridge = bridgeMaker.toMutableList()
        newBridge.removeAt(0)
        addAnswer(myPick, true)
        Controller().readCurrent(myPicks, bridgeAnswer)
        return move(newBridge)
    }

    fun retry(bridgeMaker: List<String>) {
        when (Controller().writeGameCommand()) {
            "R" -> {
                countTry++;clearAnswer();tryMove()
            }
            "Q" -> {
                Controller().readResult(myPicks, bridgeAnswer); Controller().doneGame(bridgeMaker.size, countTry)
            }
        }
    }
}
