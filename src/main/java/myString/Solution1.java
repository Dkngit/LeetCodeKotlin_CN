package myString;

import java.util.Arrays;

/**
 * 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Solution1 {

    /*示例 1:

    输入: 123
    输出: 321
    示例 2:

    输入: -123
    输出: -321
    示例 3:

    输入: 120
    输出: 21
    注意:

    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。*/

    public int reverse(int x) {
//        String a = String.valueOf(x);
//
//        char[] b = new char[a.length()];
//        int offset = 1;
//
//        if (a.charAt(0) == '-') {
//            offset = 0;
//            b[0] = '-';
//        }
//
//
//        for (int i = a.length()-1; i > -offset; i--) {
//            b[a.length()-offset-i] = a.charAt(i);
//        }
//
//        String s = String.valueOf(b);
//        if (Long.parseLong(s) > Integer.MAX_VALUE || Long.parseLong(s) < Integer.MIN_VALUE) {
//            return 0;
//        }
//
//        return Integer.parseInt(s);

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int a = 123;
        int b = -123;
        int c = 120;

        System.out.println(solution1.reverse(a));
        System.out.println(solution1.reverse(b));
        System.out.println(solution1.reverse(c));
    }
}
