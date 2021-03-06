package myString;

/**
 * 字符串转换整数 (atoi)
 */
public class Solution5 {

    /*请你来实现一个 atoi 函数，使其能将字符串转换成整数。

    首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：

    - 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
    - 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
    - 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。

    注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。

    在任何情况下，若函数不能进行有效的转换时，请返回 0 。

    提示：

    本题中的空白字符只包括空格字符 ' ' 。
    假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−2^31,  2^31 − 1]。如果数值超过这个范围，请返回  INT_MAX (2^31 − 1) 或 INT_MIN (−2^31) 。*/

    public int myAtoi(String str) {
        long total = 0L;
        int negative = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (negative == 0) {
                if (c == ' ') {
                    continue;
                }

                if (c == '+') {
                    negative = 1;
                    continue;
                } else if (c == '-') {
                    negative = -1;
                    continue;
                }
            }

            if ('0' <= c && c <= '9') {
                if (negative == 0) {
                    negative = 1;
                }
                total = total * 10L + (c - '0') * negative;

                if (Integer.MIN_VALUE > total) {
                    return Integer.MIN_VALUE;
                }
                if (total > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

            } else {
                break;
            }
        }

        return (int) total;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();

        System.out.println(solution5.myAtoi("42"));
        System.out.println(solution5.myAtoi("   -42"));
        System.out.println(solution5.myAtoi("4193 with words"));

        /*输入: "words and 987"
        输出: 0
        解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
        因此无法执行有效的转换。*/
        System.out.println(solution5.myAtoi("words and 987"));
        System.out.println(solution5.myAtoi("-91283472332"));
        System.out.println(solution5.myAtoi("+-2"));
        System.out.println(solution5.myAtoi("   +0 123"));
    }
}
