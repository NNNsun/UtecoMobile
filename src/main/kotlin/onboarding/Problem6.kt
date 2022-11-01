package onboarding
fun solution6(forms: List<List<String>>) : List<String>{
    var map = HashMap<String, Int>()
    var result = mutableListOf<String>()
    var divWord = ""
    var comparison = ""
    var len = forms.size //4
    for (i in 0 until len) { //0..3
        divWord = forms[i][1]
        for (i in 1 until divWord.length) {
            comparison = divWord[i - 1] + divWord[i].toString()
        }
    }
    return result.sorted()
}


