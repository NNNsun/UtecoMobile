package bridge

class BridgeMaker(private val bridgeNumberGenerator: BridgeNumberGenerator) {
    fun makeBridge(size: Int): List<String> {
        val bridge = mutableListOf<String>()
        for (i in 0 until size) {
            when (bridgeNumberGenerator.generate()) {
                0 -> bridge.add("D")
                1 -> bridge.add("U")
            }
        }
        return bridge
    }
}
