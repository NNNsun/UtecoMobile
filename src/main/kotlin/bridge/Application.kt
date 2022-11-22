package bridge

fun main() {
    playSquidGame()
}

fun playSquidGame(){
    OutputView().printGameStart()
    val bridgeSize = InputView().readBridgeSize()
    val bridgeMaker = BridgeMaker(BridgeRandomNumberGenerator())
    val bridge=bridgeMaker.makeBridge(bridgeSize)
    BridgeGame(bridge).tryMove()
}