package myString;

/**
 * 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class Solution2 {

    /*示例：

    s = "leetcode"
    返回 0

    s = "loveleetcode"
    返回 2


    提示：你可以假定该字符串只包含小写字母。*/

    public int firstUniqChar(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            if (arr[index] > 0) {
                arr[index] = -1;
            }
            if (arr[index] != -1) {
                arr[index] = i+1;
            }
        }

        int r = s.length()+1;
        for (int a : arr) {
            if (a > 0 && a < r) {
                r = a;
            }
        }

        if (r == s.length()+1) {
            return -1;
        }

        return r-1;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        String a = "leetcode";
        String b = "loveleetcode";

        System.out.println(solution2.firstUniqChar(a));
        System.out.println(solution2.firstUniqChar(b));
    }
}
