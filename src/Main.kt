fun main(args: Array<String>) {
//    println(solution(5, intArrayOf(10, 6, 8, 4, 7, 5, 4, 4, 5, 3, 2, 1)))
    println(
        solution(
            arrayOf(
                arrayOf("yellowhat", "headgear"),
                arrayOf("bluesunglasses", "eyewear"),
                arrayOf("green_turban", "headgear")
            )
        )
    )
}

fun solution(clothes: Array<Array<String>>): Int {
    val map = HashMap<String, Int>()
    for (i in clothes.indices) {
        map[clothes[i][1]] = map.getOrDefault(clothes[i][1], 0) + 1
    }

    println(map)

    var result = 1

    for (i in map.keys) {
        val i1 = map[i]
        if (i1 != null) {
            result *= i1
            println(result)
        }
    }
    clothes.groupBy { it[1] }.values
        .map { it.size + 1 }





    return result - 1
}

fun solution() {

}
