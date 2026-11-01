/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int index = 0;

        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == 0) {
                    return "";
                }
                if (index >= strs[i].length()) {
                    return prefix;
                }
                if (strs[i].charAt(index) != strs[0].charAt(index)) {
                    return prefix;
                }
            }
            prefix += strs[0].charAt(index);
            index++;
        }
    }
}
// @lc code=end
