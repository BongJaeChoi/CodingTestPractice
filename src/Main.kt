fun main() {
//    print(runningSum(intArrayOf(1, 1, 1, 1, 1)))
//    print(findErrorNums(intArrayOf(1, 2, 2, 4)).contentToString())
//    print(solution(arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa")))
    print(pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
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

fun pivotIndex(nums: IntArray): Int {
    var leftSum = 0
    var rightSum = nums.drop(1).sum()
    val result = -1

//    println("rightSum :${rightSum} / left:${leftSum}")

    for (i in nums.indices) {
        //같을때 까지
        if (leftSum == rightSum) {
            return i
        }

        //돌때마다 무조건 왼쪽 합은 한번 더해야함. 그래야 비교가능
        leftSum += nums[i]

        //포인터가 마지막 인덱스까지 왔다는건 rightSum 을 구할 수 없다는것이므로 rightSum = 0
        if (i + 1 == nums.size) {
            rightSum = 0
        } else {
            //돌때마다 무조건 오른쪽합 구하기 그래야 비교가능. 미리 다 더해놓고 포인터로 빼면 된다.
            rightSum -= nums[i + 1]
        }
//        println("rightSum :${rightSum} / left:${leftSum}")
    }
    return result
}


fun solution(babbling: Array<String>): Int {
    val arr = arrayOf("aya", "ye", "woo")
    var result = 0
    babbling.forEachIndexed { i, s ->
        arr.forEachIndexed { j, k ->
            if (s.contains(k)) {
                result++
            }
        }
    }
    return result
}