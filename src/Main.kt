fun main() {
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

fun solution(n: Int): Int {
    val answer = IntArray(n)
    answer[0] = 1
    answer[1] = 1

    for (i in 2 until n) {
        answer[i] = answer[i - 2] + answer[i - 1]
    }
    return answer.last()
}


private fun fibonacciArr(n: Int): Int {
    Array(n) { 0 }.also {
        it[0] = 1
        it[1] = 1
        for (i in 2 until it.size) {
            it[i] = it[i - 1] + it[i - 2]
        }
        return it.last()
    }
}

fun solution(denum1: Int, num1: Int, denum2: Int, num2: Int): IntArray {
    val top = denum1 * num2 + denum2 * num1
    val bottom = num1 * num2

    var max = 1

    for (i in 1..top) {
        if (top % i == 0 && bottom % i == 0) {
            max = i
        }
    }

    return intArrayOf(top / max, bottom / max)
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