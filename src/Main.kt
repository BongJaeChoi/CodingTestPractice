import java.util.*

fun main() {
    println(solution(166).contentToString())
}

fun solution(n: Int): IntArray {
    val list = arrayListOf<Int>()
    for (i in 1..n) {
        if (i % 2 == 1) {
            list.add(i)
        }
    }
    return list.toIntArray()
}
