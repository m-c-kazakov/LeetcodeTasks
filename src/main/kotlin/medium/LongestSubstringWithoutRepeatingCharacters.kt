package medium

import org.assertj.core.api.Assertions.assertThat

/**
 * 3. Longest Substring Without Repeating Characters:
 *  https://leetcode.com/problems/longest-substring-without-repeating-characters/description
 *
 */

fun main() {

    val pair1 = Pair("abcabcbb", 3) //"abc"
    val pair2 = Pair("bbbb", 1) // "b"
    val pair3 = Pair("pwwkew", 3) // "wke"
    val pair4 = Pair(" ", 1) // " "
    val pair5 = Pair("au", 2) // "au"
    val pair6 = Pair("dvdf", 3) // "vdf"

//    assertThat(lengthOfLongestSubstring(pair1.first)).isEqualTo(pair1.second)
//    assertThat(lengthOfLongestSubstring(pair2.first)).isEqualTo(pair2.second)
//    assertThat(lengthOfLongestSubstring(pair3.first)).isEqualTo(pair3.second)
//    assertThat(lengthOfLongestSubstring(pair4.first)).isEqualTo(pair4.second)
//    assertThat(lengthOfLongestSubstring(pair5.first)).isEqualTo(pair5.second)
    assertThat(lengthOfLongestSubstring(pair6.first)).isEqualTo(pair6.second)



}


fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) {
        return 0
    }

    var maxCountNonRepeatedElements = 1
    var nonRepeatedElements: String = s[0].toString()
    var countNonRepeatedElements = 1

    (1 until s.length).forEach {
        if (!nonRepeatedElements.contains(s[it])) {
            nonRepeatedElements += s[it]
            countNonRepeatedElements++
        } else {
            nonRepeatedElements = s[it].toString()
            countNonRepeatedElements = 1
        }

        if (countNonRepeatedElements > maxCountNonRepeatedElements) {
            maxCountNonRepeatedElements = countNonRepeatedElements
        }
    }

    return maxCountNonRepeatedElements
}