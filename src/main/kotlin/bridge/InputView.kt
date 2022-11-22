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

    fun readMoving(): String {
        println(Comment.InputComment.CHOICE.message)
        val input = Console.readLine()
        if (!(Exception(input).checkOverLength())) return readMoving()
        if (!(Exception(input).checkLessLength())) return readMoving()
        if (!(Exception(input).isString())) return readMoving()
        if (!(Exception(input).checkUpperCase())) return readMoving()
        if (!(Exception(input).checkDirection())) return readMoving()
        return input
    }

    fun readGameCommand(): String {
        println(Comment.InputComment.OVER.message)
        val input = Console.readLine()
        if (!(Exception(input).checkOverLength())) return readGameCommand()
        if (!(Exception(input).checkLessLength())) return readGameCommand()
        if (!(Exception(input).isString())) return readGameCommand()
        if (!(Exception(input).checkUpperCase())) return readGameCommand()
        if (!(Exception(input).checkDecision())) return readGameCommand()
        return input
    }
}
