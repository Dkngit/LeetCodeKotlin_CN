package myArray;

/**
 * 删除排序数组中的重复项
 */
public class Solution0 {

    public int removeDuplicates(int[] nums) {
        int i0 = 0;
        int i1 = 1;
        while (i1 < nums.length-1) {
            if (nums[i0] >= nums[i0+1]){
                while (i1 < nums.length) {
                    if (nums[i0] < nums[i1]) {
                        nums[i0+1] = nums[i1];
                        break;
                    }
                    i1++;
                }
            }
            i0++;
            if (i1 >= nums.length){
                return i0;
            }
        }
        return nums.length;
    }
}
