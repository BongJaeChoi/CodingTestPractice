fun main() {
//    print(runningSum(intArrayOf(1, 1, 1, 1, 1)))
    print(pivotIndex(intArrayOf(2, 1, -1)))
}

fun runningSum(nums: IntArray): IntArray {
    val result = arrayListOf<Int>()
    var temp = 0
    for (num in nums) {
        temp += num;
        result.add(temp)
    }
    return result.toIntArray();
}

fun pivotIndex(nums: IntArray): Int {
    var p1 = 0
    var p2 = nums.size - 1
    var index = -1

    var leftSum = 0
    var rightSum = 0

    while (leftSum == rightSum) {

        leftSum += nums[p1]
        rightSum += nums[p2]
        p1++
        p2--
        println("left :${leftSum} / right :${rightSum}")


        index++
    }
    return index;
}