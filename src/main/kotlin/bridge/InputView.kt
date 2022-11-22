package bridge

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBridgeSize(): Int {
        println(Comment.InputComment.RANGE.message)
        val size = Console.readLine()
        if (!(Exception(size).checkInteger()) || !(Exception(size).checkRange())) {
            return readBridgeSize()
        }
        return size.toInt()
    }
}
