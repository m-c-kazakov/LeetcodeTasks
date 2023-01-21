package easy

import org.assertj.core.api.Assertions.assertThat


fun twoSum(nums: IntArray, target: Int): IntArray {

    (0 until nums.size-1).forEach {
        val first = it
        (it+1 until nums.size).forEach {
            val second = it
            if (nums[first]+nums[second] == target)
                return intArrayOf(first,second)
        }
    }

    return intArrayOf()
}

fun bestSolution(nums: IntArray, target: Int): IntArray {
    val diffMap = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, int ->
        diffMap[int]?.let {
            return intArrayOf(it, index)
        }
        diffMap[target - int] = index
    }
    return intArrayOf()
}


fun main() {

//    test1()
    test2()


}

private fun test2() {
    val nums = intArrayOf(3, 2, 3)
    val target = 6
    assertThat(twoSum(nums, target))
        .hasSize(2)
        .contains(0, 2)
}

private fun test1() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    assertThat(twoSum(nums, target))
        .hasSize(2)
        .contains(0, 1)
}

