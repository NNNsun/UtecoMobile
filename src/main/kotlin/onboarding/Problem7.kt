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
    var overlapMan1 = ""
    var overlapMan2 = ""
    for (i in 0 until dupList.size) {
        overlapMan1=dupList[i][0]
        overlapMan2=dupList[i][1]
        if(!set.contains(overlapMan1)) {
            map[overlapMan1] = map.getOrDefault(overlapMan1, 0) + 10
            continue
        }
        else if (!set.contains(overlapMan2)) {
            map[overlapMan2] = map.getOrDefault(overlapMan2, 0) + 10
            continue
        }
    }

    return list
}