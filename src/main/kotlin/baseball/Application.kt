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
