package myArray;

import java.util.Arrays;

/**
 * 加一
 * <p>
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Solution6 {

    /*输入: [1,2,3]
    输出: [1,2,4]
    解释: 输入数组表示数字 123。*/

    /*输入: [4,3,2,1]
    输出: [4,3,2,2]
    解释: 输入数组表示数字 4321。*/

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            int digit = digits[i];
            if (digit != 9) {
                digits[i] = digit+1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] digits2 = new int[digits.length+1];
        digits2[0] = 1;
        return digits2;
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();

        int[] a = {1, 2, 3};
        int[] b = {4, 3, 2, 1};

        System.out.println(Arrays.toString(solution6.plusOne(a)));
        System.out.println(Arrays.toString(solution6.plusOne(b)));
    }
}
