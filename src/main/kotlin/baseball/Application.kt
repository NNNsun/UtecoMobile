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
