package myArray;

/**
 * 旋转数组
 */
public class Solution2 {
    public void rotate(int[] nums, int k) {
        int k1 = k % nums.length;
        int[] a = new int[k1];
        int j = k1-1;
        for (int i = nums.length-1; i > -1; i--) {
            if (j > -1) {
                a[j] = nums[i];
                j--;
            }
            if (i >= k1) {
                nums[i] = nums[i-k1];
            }else {
                nums[i] = a[i];
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Solution2 solution2 = new Solution2();
        solution2.rotate(a, 3);
    }
}
