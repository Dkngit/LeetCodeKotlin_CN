package myArray;

import java.util.*;

/**
 * 两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */
public class Solution5 {
    public int[] intersect(int[] nums1, int[] nums2) {
//        输入: nums1 = [1,2,2,1], nums2 = [2,2]
//        输出: [2,2]
//        输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        输出: [4,9]

//        Set<Integer> sets = new HashSet<>();
//        int[] a1 = null;
//        int[] a2 = null;
//        if (nums1.length > nums2.length) {
//            a1 = nums1;
//        }
//        for (int a : nums1) {
//            sets.add(a);
//        }
//        List<Integer> list = new LinkedList<>();
//        for (int b : nums2) {
//            if (sets.contains(b)) {
//                list.add(b);
//            }
//        }
//        int[] o = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//            o[i] = integer;
//        }
//        return o;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            Integer count = map.get(i);
            if (count == null) {
                count = 0;
            }
            map.put(i, ++count);
        }
        List<Integer> list = new LinkedList<>();
        for (int i : nums2) {
            Integer count = map.get(i);
            if (count != null && count > 0) {
                list.add(i);
                map.put(i, --count);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;

    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();

        int[] a = {1, 2, 2, 1};
        int[] a1 = {2, 2};
        //输出: [2,2]
        int[] b = {4, 9, 5};
        int[] b1 = {9, 4, 9, 8, 4};
        //输出: [4,9]

        solution5.showArray(solution5.intersect(a, a1));
        solution5.showArray(solution5.intersect(b, b1));
    }

    public void showArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
