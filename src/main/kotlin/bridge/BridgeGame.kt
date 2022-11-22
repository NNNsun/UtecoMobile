package bridge

class BridgeGame {
    var countTry = 1
    var myPicks = mutableListOf<String>()
    var bridgeAnswer = mutableListOf<Boolean>()
    fun move(currentBridge: List<String>) {
        when {
            currentBridge.isNotEmpty()->{}
            currentBridge.isEmpty() -> {}
        }
    }

    fun retry() {}
}
