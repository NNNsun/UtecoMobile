package baseball

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console


fun main() {

}

private fun makeComNumber(): List<String> {
    val comNumber: MutableList<String>
    val randomNumber = mutableSetOf<String>()
    while (randomNumber.size < 3) {
        randomNumber.add(Randoms.pickNumberInRange(1, 9).toString())
    }
    comNumber = randomNumber.toMutableList()
    return comNumber
}

private fun checkInputNumber(userNumber: List<String>) {
    val numLength = mutableSetOf<String>()
    for (comNumIdx in userNumber.indices) {
        if (userNumber[comNumIdx].single() in '1'..'9') {
            numLength.add(userNumber[comNumIdx])
        }
    }
    if (userNumber.isEmpty() || numLength.size != 3) {
        throw IllegalArgumentException()
    }
}

private fun checkScore(
    userNumber: List<String>,
    comNumber: List<String>,
    comNumIdx: Int,
    userNumIndex: Int,
    userScore: ScoreData
): ScoreData {
    if (comNumber[comNumIdx] == userNumber[userNumIndex]) {
        if (comNumIdx == userNumIndex) {
            userScore.strike += 1
        } else {
            userScore.ball += 1
        }
    }
    return userScore
}

private fun countScore(
    comNumber: List<String>,
    userNumber: List<String>,
    userScore: ScoreData
): ScoreData {
    for (comNumIdx in comNumber.indices) {
        for (userNumIndex in userNumber.indices) {
            checkScore(userNumber, comNumber, comNumIdx, userNumIndex, userScore)
        }
    }
    return userScore
}

private fun printScore(userScore: ScoreData): Boolean {
    val strike = userScore.strike
    val ball = userScore.ball
    var win = false
    if (strike == 0 && ball == 0) print("낫싱")
    if (ball > 0) print("${ball}볼 ")
    if (strike in 1..2) print("${strike}스트라이크 ")
    if (strike == 3) {
        print("${strike}스트라이크 ")
        win = true
    }
    println()
    return win
}

private fun playAgain(): Boolean {
    var choice = true
    println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    when (Console.readLine()) {
        "1" -> choice = true
        "2" -> choice = false
    }
    return choice
}

private fun playBall(comNumber: List<String>, userScore: ScoreData): Boolean {
    var gameOver = false
    val newGame = true
    while (!gameOver) {
        userScore.ball = 0
        userScore.strike = 0
        print("숫자를 입력해주세요 : ")
        val userNumber = Console.readLine().chunked(1)
        checkInputNumber(userNumber)
        countScore(comNumber, userNumber, userScore)
        gameOver = printScore(userScore)
    }
    return if (playAgain()) newGame
    else !newGame
}

data class ScoreData(
    var strike: Int = 0,
    var ball: Int = 0
)