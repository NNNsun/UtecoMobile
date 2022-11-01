package onboarding
fun solution1(pobi: List<Int>, crong: List<Int>): Int {

}

fun calculate(num: Int): Int {
    val a = num.toString().map {
        it.code - '0'.code
    }.sum()
    val b = num.toString().map {
        it.code - '0'.code
    }.mul()
    return if (a > b) a else b
}
fun Iterable<Int>.mul(): Int {
    var mul = 1
    for (element in this) {

        if(element==0) return 0
        mul *= element
    }
    return mul

}



fun choice(num1: Int,num2: Int):Int{

}

fun win(num1: Int, num2: Int): Int {

}