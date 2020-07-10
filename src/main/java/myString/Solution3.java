package myString;

/**
 * 有效的字母异位词
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class Solution3 {

    /*示例 1:

    输入: s = "anagram", t = "nagaram"
    输出: true
    示例 2:

    输入: s = "rat", t = "car"
    输出: false
    说明:
    你可以假设字符串只包含小写字母。

    进阶:
    如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？*/


    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)-97]--;
        }

        for (int value : arr) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String a1 = "anagram";
        String a2 = "nagaram";
        String b1 = "rat";
        String b2 = "car";

        System.out.println(solution3.isAnagram(a1, a2));
        System.out.println(solution3.isAnagram(b1, b2));
    }
}
