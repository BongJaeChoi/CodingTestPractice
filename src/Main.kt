import java.util.*
import kotlin.math.ceil

fun main() {
    println(solution(29))
}

fun solution(n: Int): Int {
    /*
    >7 = 7
    >14 = 2
    >21
     */
    val a = 7.0
    val b = n.toDouble()
    return ceil(b / a).toInt()
}
