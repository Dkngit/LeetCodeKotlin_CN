package myArray;

import java.util.Arrays;
import java.util.Random;

/**
 * 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Solution7 {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                }
                j++;
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        /*输入: [0,1,0,3,12]
        输出: [1,3,12,0,0]*/

        /*说明:

        必须在原数组上操作，不能拷贝额外的数组。
        尽量减少操作次数。*/

        Solution7 solution7 = new Solution7();

        Random random = new Random();

        int[] a = {0, 1, 0, 3, 12};
        int[] b = new int[random.nextInt(10)];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(20);
        }
        System.out.println("old b: " + Arrays.toString(b));
        solution7.moveZeroes(a);
        solution7.moveZeroes(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
