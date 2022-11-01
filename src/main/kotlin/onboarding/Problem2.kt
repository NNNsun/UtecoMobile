package onboarding
import java.util.*

fun solution2(cryptogram: String) :String{
    var word = cryptogram.chunked(1).toMutableList() as ArrayList<String>
    return refine(word)
}


