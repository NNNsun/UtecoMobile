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

}



fun choice(num1: Int,num2: Int):Int{

}

fun win(num1: Int, num2: Int): Int {

}