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

data class ScoreData(
    var strike: Int = 0,
    var ball: Int = 0
)