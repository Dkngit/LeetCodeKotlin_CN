package myString;

/**
 * 验证回文字符串
 * <p>
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class Solution4 {

    /*说明：本题中，我们将空字符串定义为有效的回文串。

    示例 1:

    输入: "A man, a plan, a canal: Panama"
    输出: true
    示例 2:

    输入: "race a car"
    输出: false*/

    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > j) {
                break;
            }
            a1 = fun1(s.charAt(i));
            if (a1 > 0) {
                while (j > i) {
                    b1 = fun1(s.charAt(j));
                    j--;
                    if (b1 > 0) {
                        if (b1 != a1) {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }

    private int fun1(char c) {
        if ('A' <= c && c <= 'Z') {
            return c;
        }
        if ('a' <= c && c <= 'z') {
            return c - 32;
        }
        if ('0' <= c && c <= '9') {
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();

        System.out.println(solution4.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution4.isPalindrome("race a car"));
    }
}
