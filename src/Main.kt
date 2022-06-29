fun main(args: Array<String>) {
//    println(solution(5, intArrayOf(10, 6, 8, 4, 7, 5, 4, 4, 5, 3, 2, 1)))
//    println(solution(arrayOf("muzi","forodo","apeach","neo"), arrayOf("frodo neo","muzi forodo"),2))
    println(solution("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"))
}

fun solution() {

}

fun solution(G: String): Int {
    /**
     * 1번 가위바위보 문제
     * 이기면 2점 비기면 1점 지면 0점
     */

    var rResult = 0
    var sResult = 0
    var pResult = 0

    //묵만 낼 때
    for (c in G) {
        val score = when (c) {
            'R' -> 1
            'S' -> 2
            'P' -> 0
            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
        }
        rResult += score
    }

    //찌만 낼 때
    for (c in G) {
        val score = when (c) {
            'R' -> 0
            'S' -> 1
            'P' -> 2
            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
        }
        sResult += score
    }

    //빠만 낼 때
    for (c in G) {
        val score = when (c) {
            'R' -> 2
            'S' -> 0
            'P' -> 1
            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
        }
        pResult += score
    }

    val intArr = intArrayOf(rResult, sResult, pResult)
    intArr.sort()

    return intArr.last()
}
