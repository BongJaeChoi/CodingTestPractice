import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.temporal.ChronoUnit

fun solution(E: String, L: String): Int {
    val startTime = LocalTime.of(E.split(":")[0].toInt(), E.split(":")[1].toInt())
    val endTime = LocalTime.of(L.split(":")[0].toInt(), L.split(":")[1].toInt())

    val between = ChronoUnit.MINUTES.between(startTime, endTime)

    var timeCost = if (between % 60 != 0L) {
        between + 60
    } else {
        between
    }

    timeCost /= 60

    return (2 + 3 + ((timeCost - 1) * 4)).toInt()
}


fun main(args: Array<String>) {

    println(solution("10:00", "13:21"))
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
