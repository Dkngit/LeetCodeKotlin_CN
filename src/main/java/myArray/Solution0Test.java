package myArray;

public class Solution0Test {

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution0 solution0 = new Solution0();
        int len = solution0.removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
