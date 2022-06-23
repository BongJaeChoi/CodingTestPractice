fun solution(n: Int): Int {

    val x = Integer.toBinaryString(n)
    val arr = x.split("1")


    var result = 0

    println(x)
    println(arr)

    if (arr.size == 2) {
        return 0
    }

    for (i in 1 until arr.size) {

        if (arr[i].isEmpty()) {
            continue
        }
        result = Math.max(result, arr[i].length)
    }



    return result
}


fun main(args: Array<String>) {

    println(solution(51712))
//    println(solution(32))


}

fun solution(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)

    val arr = A.asSequence()
        .distinct()
        .sorted()
        .filter { it > 0 }
        .toList()

    if (arr.isEmpty()) {
        return 1
    }


    for (i in arr.indices) {
        println("${(i + 1)} / ${arr[i]}")
        if ((i + 1) != arr[i]) {
            return (i + 1)
        }
    }

    return arr[arr.size - 1] + 1
}
