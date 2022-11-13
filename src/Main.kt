import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
//    val input1 = sc.nextInt()
//    val input2 = sc.nextInt()
//    solution(input1, input2)
    val a = arrayOf("classic", "pop", "classic", "classic", "pop")
    val b = intArrayOf(500, 600, 150, 800, 2500)

    println(solution(a, b).contentToString())
}

fun solution(input1: Int, input2: Int) {


}

fun solution(genres: Array<String>, plays: IntArray): IntArray {
    val orderMap = HashMap<String, Int>()

    genres.forEachIndexed { index, s ->
        orderMap[s] = orderMap.getOrDefault(s, 0) + plays[index]
    }

    println("orderMap : ${orderMap}")

    //장르별 높은 순서대로 플레이 카운트 정렬
    val sortedGenres = orderMap.toList()
        .sortedWith(compareBy { -it.second })
        .toMap()

    println("정렬됬나 :${sortedGenres}")


    val countMap = HashMap<Int, String>()
    plays.forEachIndexed { index, i ->
        countMap[i] = genres[index]
    }

    //2개까지만 결과 입력
    val answer = arrayListOf<Int>()

    val message = countMap.toList().sortedByDescending { pair: Pair<Int, String> -> sortedGenres[pair.second] }.toMap()
    println("message : ${message}")

    var genre = sortedGenres.entries.first().key
    var count = 0
    println("plays 뭔데 :${plays.indexOf(800)}")
    for ((index, element) in message.entries.withIndex()) {
        plays.forEach {
            if (element.value == message.get(it)) {
            }
        }
        answer.add(plays.indexOf(element.key))
    }
    return answer.toIntArray()
}

