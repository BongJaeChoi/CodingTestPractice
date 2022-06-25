import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.temporal.ChronoUnit
import java.util.*

fun solution(A: IntArray, K: Int): IntArray {
    val result = A.toList()


    Collections.rotate(result, K)



    return result.toIntArray()
}


fun main(args: Array<String>) {

    println(solution(intArrayOf(3, 8, 9, 7, 6), 3).contentToString())
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
