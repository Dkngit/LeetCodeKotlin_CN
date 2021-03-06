package myString;

import java.util.Arrays;

/**
 * 反转字符串
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class Solution0 {

    /*示例 1：

    输入：["h","e","l","l","o"]
    输出：["o","l","l","e","h"]
    示例 2：

    输入：["H","a","n","n","a","h"]
    输出：["h","a","n","n","a","H"]
    */

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char c = s[i];
            int i1 = s.length - 1 - i;
            s[i] = s[i1];
            s[i1] = c;
        }
    }

    public static void main(String[] args) {
        Solution0 solution0 = new Solution0();
        
        char[] a = {'h','e','l','l','o'};
        char[] b = {'H','a','n','n','a','h'};

        solution0.reverseString(a);
        solution0.reverseString(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
