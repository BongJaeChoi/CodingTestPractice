fun main(args: Array<String>) {
    println(solution(intArrayOf(10, 6, 8, 7, 4, 5, 3, 2, 1)))
}

fun solution(A: IntArray): Int {
    /**
     * 배열 숫자 하나 빠졌다 찾아라~
     */

    val sortedList = A.sorted()

    for (i in 1..100_000) {
        if (!sortedList.contains(i)) {
            return i
        }
    }
    throw java.lang.RuntimeException("다 있어요~")
}

fun solution() {

}
