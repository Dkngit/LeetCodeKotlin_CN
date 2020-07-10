package myArray;

import java.util.Arrays;

/**
 * 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Solution4 {
    public int singleNumber(int[] nums) {

        //[2,2,1]
        //[4,1,2,1,2]

//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i+=2) {
//            if (nums[i] != nums[i + 1]) {
//                return nums[i];
//            }
//        }
//        return nums[nums.length-1];

        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();

        int[] a = {2, 2, 1};
        int[] b = {4, 1, 2, 1, 2};
        System.out.println(solution4.singleNumber(a));
        System.out.println(solution4.singleNumber(b));
    }
}
