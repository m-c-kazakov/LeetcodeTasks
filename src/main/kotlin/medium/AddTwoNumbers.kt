package medium

import org.assertj.core.api.Assertions.assertThat

/**
 * 2. Add Two Numbers: https://leetcode.com/problems/add-two-numbers/
 *
 */


fun main() {

//    assertThat(addTwoNumbers(ListNode(1), ListNode(1))?.getInt()).isEqualTo("2")

//    [2,4,3]
//    [5,6,4]
//    [7,0,8]
//    assertThat(addTwoNumbers(
//        ListNode(2, ListNode(4, ListNode(3))),
//        ListNode(5, ListNode(6, ListNode(4)))
//    )?.getInt()).isEqualTo("708")

//    [9,9,9,9,9,9,9]
//    [9,9,9,9]
//    [8,9,9,9,0,0,0]

    val addTwoNumbers = addTwoNumbers(
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9))))))),
        ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
    )
    assertThat(addTwoNumbers?.getInt()).isEqualTo("89990001")


}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?, addValue: Int = 0,): ListNode? {

    if (l1 == null && l2 == null && addValue == 0) {
        return null
    }

    val l1Val = l1?.`val` ?: 0
    val l2Val = l2?.`val` ?: 0

    val resultValue = l1Val + l2Val + addValue

    val listNode = ListNode(
        resultValue % 10
    )
    listNode.next = addTwoNumbers(l1?.next, l2?.next, resultValue/10)
    return listNode

}


class ListNode(var `val`: Int, var next: ListNode? = null) {

//    var next: ListNode? = null

    fun getInt(): String {
        val result: String = `val`.toString() + (next?.getInt() ?: "")
        return result
    }
}