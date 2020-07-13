package myString;

import java.util.LinkedList;
import java.util.List;

/**
 * 实现 strStr()
 * <p>
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class Solution6 {

    /*示例 1:

    输入: haystack = "hello", needle = "ll"
    输出: 2
    示例 2:

    输入: haystack = "aaaaa", needle = "bba"
    输出: -1
    说明:

    当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

    对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。*/

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();

        for (int i = 0; i <= (chars1.length-chars2.length); i++) {
            if (chars1[i] == chars2[0]) {
                boolean b = true;
                for (int j = 1; j < chars2.length; j++) {
                    if (chars1[i+j] != chars2[j]) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();

        System.out.println(solution6.strStr("hello", "ll"));
        System.out.println(solution6.strStr("aaaaa", "bba"));
        System.out.println(solution6.strStr("abbcdaabcd", "bcd"));

        /*"mississippi"
          "issip"*/
        System.out.println(solution6.strStr("mississippi", "issip"));

        
    }

}
