fun main(args: Array<String>) {
    println(solution(10, 1005, 30))
}

fun solution(X: Int, Y: Int, D: Int): Int {
    /**
     * 작은 개구리는 길 반대편으로 가고 싶어합니다.
     * 개구리는 현재 위치 X에 있고 Y보다 크거나 같은 위치에 도달하려고 합니다.
     * 작은 개구리는 항상 고정된 거리 D를 점프합니다.
     * 최소 회수를 구하시오
     */

    if (X == Y) {
        return 0
    }

    val distance = (Y - X)
    return Math.ceil(distance.toDouble() / D.toDouble()).toInt()

}

fun solution() {

}
