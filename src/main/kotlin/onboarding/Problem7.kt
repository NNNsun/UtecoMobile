package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    var dupList=friends.toMutableList()
    var map = HashMap<String, Int>()
    var set =HashSet<String>()

    for (i in 0 until dupList.size) {
        if (dupList[i][0] == user) {
            set.add(dupList[i][1])

        } else if (dupList[i][1] == user) {
            set.add(dupList[i][0])

        }
    }
    set.add(user)
    return list
}