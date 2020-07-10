package myArray;

import java.util.*;

/**
 * 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class Solution8 {
    /*
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();

        int[] a1 = {2, 7, 11, 15};
        int a2 = 9;

        int[] b1 = {3, 2, 4};
        int b2 = 6;

        int[] c1 = {0, 4, 3, 0};
        int c2 = 0;

        int[] d1 = {-3, 4, 3, 90};
        int d2 = 0;

        System.out.println(Arrays.toString(solution8.twoSum(a1, a2)));
        System.out.println(Arrays.toString(solution8.twoSum(b1, b2)));
        System.out.println(Arrays.toString(solution8.twoSum(c1, c2)));
        System.out.println(Arrays.toString(solution8.twoSum(d1, d2)));
    }
}
