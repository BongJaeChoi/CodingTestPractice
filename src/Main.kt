fun main() {
//    print(runningSum(intArrayOf(1, 1, 1, 1, 1)))
    print(findErrorNums(intArrayOf(1, 2, 2, 4)).contentToString())
}

fun findErrorNums(nums: IntArray): IntArray {
    val hashMap = HashMap<Int, Int>()
    var miss = -1
    var duplicate = -1
    nums.forEach { i ->
        hashMap[i] = hashMap.getOrDefault(i, 0) + 1
    }
    println(hashMap)
    for (i in 1..nums.size) {
        if (hashMap.containsKey(i)) {
            if (hashMap[i] == 2) {
                duplicate = i
            }
        } else {
            miss = i // 1부터 들어있으므로 해시맵에 들어있지 않은 값이 없는값

        }
    }

    return intArrayOf(duplicate, miss)
}