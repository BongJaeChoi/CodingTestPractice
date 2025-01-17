import java.util.*
import kotlin.collections.HashMap
import kotlin.math.ceil

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
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

fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()
    val set = HashSet<Char>()
    for (i in s.indices) {
        val sc = s[i]
        val tc = t[i]
        if (map.containsKey(sc)) { // p
            if (map[sc] != tc) { // p 를 t 라고 매핑 했는데 아니면 false!!
                return false
            }
        } else {
            // 값이 중복됨. 매핑되지 않으므로 false
            if (set.contains(tc)) {
                return false
            }
            map[sc] = tc // p = t, a = i
            set.add(tc) // t, i
        }
    }

    return true
}

fun isSubsequence(s: String, t: String): Boolean {
    val sCharArray = s.toCharArray()
    val tCharArray = t.toCharArray()

    var i = 0
    var j = 0

    while (i < sCharArray.size && j < tCharArray.size) {
        if (sCharArray[i] == tCharArray[j]) {
            i++ // 같은 값이 있을때만 증가
        }
        j++
    }



    return i == s.length
}