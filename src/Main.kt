fun main() {
    println(solution(intArrayOf(1, 2, 2, 5, 5, 5, 4)))
}

fun solution(array: IntArray): Int {
    if (array.size == 1) {
        return array[0]
    }

    val hashmap = HashMap<Int, Int>()

    array.forEach { i ->
        hashmap[i] = hashmap.getOrDefault(i, 0) + 1
    }

    println(hashmap)

    val values = hashmap.values
    val i = values.maxOrNull() ?: -1
    if (values.count { it == i } > 1) {
        return -1
    }

    return hashmap.entries.find { it.value == i }?.key ?: -1
}
