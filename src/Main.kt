//import java.lang.Integer.max
//import java.lang.Integer.min
//
//fun main(args: Array<String>) {
////    println(solution(5, intArrayOf(10, 6, 8, 4, 7, 5, 4, 4, 5, 3, 2, 1)))
////    println(solution(arrayOf("muzi","forodo","apeach","neo"), arrayOf("frodo neo","muzi forodo"),2))
//    val solution = solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3))
//}
//
//fun solution(G: String): Int {
//    /**
//     * 1번 가위바위보 문제
//     * 이기면 2점 비기면 1점 지면 0점
//     */
//
//    var rResult = 0
//    var sResult = 0
//    var pResult = 0
//
//    //묵만 낼 때
//    for (c in G) {
//        val score = when (c) {
//            'R' -> 1
//            'S' -> 2
//            'P' -> 0
//            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
//        }
//        rResult += score
//    }
//
//    //찌만 낼 때
//    for (c in G) {
//        val score = when (c) {
//            'R' -> 0
//            'S' -> 1
//            'P' -> 2
//            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
//        }
//        sResult += score
//    }
//
//    //빠만 낼 때
//    for (c in G) {
//        val score = when (c) {
//            'R' -> 2
//            'S' -> 0
//            'P' -> 1
//            else -> throw java.lang.IllegalArgumentException("잘못된 문자열")
//        }
//        pResult += score
//    }
//
//    val intArr = intArrayOf(rResult, sResult, pResult)
//    intArr.sort()
//
//    return intArr.last()
//}
//
//fun solution(survey: Array<String>, choices: IntArray): String {
//    var answer: String = ""
////    println(survey.toList())
////    println(choices.toList())
//
//
//    val hashMap = HashMap<Char, Int>()
//
//    hashMap['R'] = 0
//    hashMap['T'] = 0
//    hashMap['C'] = 0
//    hashMap['F'] = 0
//    hashMap['J'] = 0
//    hashMap['M'] = 0
//    hashMap['A'] = 0
//    hashMap['N'] = 0
//    val scoreArr = arrayOf(3, 2, 1, 0, 1, 2, 3)
//
//    for (i in choices.indices) {
//        //i 가 4보다 크면 두번째 인덱스
//        //아니면 첫번째 인덱스
//        //0이면 사전빠른순(아스키코드비교)
//        var key: Char
//        val score = scoreArr[choices[i] - 1]
//        key = when {
//            score == 0 -> {
//                Char(min(survey[i][0].code, survey[i][1].code))
//            }
//            choices[i] - 1 < 4 -> {
//                survey[i][0]
//            }
//            else -> {
//                survey[i][1]
//            }
//        }
//        hashMap[key] = hashMap.getOrDefault(key, hashMap[key] ?: 0) + score
//    }
//    println(hashMap)
//    val mbti = arrayOf("RT", "CF", "JM", "AN")
//    for (s in mbti) {
//        var first = s[0]
//        var second = s[1]
//
//        val firstValue = hashMap[first]!!
//        val secondValue = hashMap[second]!!
//
//        val c = when {
//            firstValue == secondValue -> {
//                Char(min(first.code, second.code))
//            }
//            firstValue > secondValue -> {
//                first
//            }
//            else -> {
//                second
//            }
//        }
//        println(c)
//        answer += c
//    }
//    println(answer)
//
//    val result = CharArray(size = 4)
//    for (index in answer.indices) {
//        when (val c = answer[index]) {
//            'T', 'R' -> {
//                result[0] = c
//            }
//            'C', 'F' -> {
//                result[1] = c
//            }
//            'J', 'M' -> {
//                result[2] = c
//            }
//            else -> {
//                result[3] = c
//            }
//        }
//    }
//
//    return result.concatToString()
//}
