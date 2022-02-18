package myArray;

/**
 * 41.缺失的第一个正数
 * <p>
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 *
 * @since 2022/2/18 14:06
 */
public class Solution11 {

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();

//        int[] nums1 = {1, 2, 0};//3
//        System.out.println(solution11.firstMissingPositive(nums1));
//        int[] nums2 = {3, 4, -1, 1};//2
//        System.out.println(solution11.firstMissingPositive(nums2));
//        int[] nums3 = {7, 8, 9, 11, 12};//1
//        System.out.println(solution11.firstMissingPositive(nums3));
        int[] nums4 = {13, 20, 2, 4, 8, 1, 15, -2};//3
        System.out.println(solution11.firstMissingPositive(nums4));
    }

    public int firstMissingPositive(int[] nums) {
        int aIndex = 0;
        int bIndex = nums.length-1;
        int z;
        while (aIndex < bIndex) {
            if (nums[aIndex] > nums[bIndex]) {
                z = nums[aIndex];
                nums[aIndex] = nums[bIndex];
                nums[bIndex] = z;
            }
        }
        return 0;
    }
}
