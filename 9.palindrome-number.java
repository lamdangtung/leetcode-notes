/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int x_rev = 0;
        int t = x;
        while (t > 0) {
            x_rev = x_rev * 10 + t % 10;
            t /= 10;
        }
        return x_rev == x;
    }
}
// @lc code=end