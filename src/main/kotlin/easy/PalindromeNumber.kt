package easy

import org.assertj.core.api.Assertions.assertThat

/**
 * 9. Palindrome Number: https://leetcode.com/problems/palindrome-number/
 */


fun main() {

    val result: Boolean = isPalindrome(121)
    assertThat(isPalindrome(121)).isTrue
    assertThat(isPalindrome(-121)).isFalse
    assertThat(isPalindrome(123)).isFalse
}

private fun isPalindrome(number: Int): Boolean {
    return number.toString().let { it == it.reversed() }
}
