package myArray;

public class Solution1Test {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        int[] b = {1, 2, 3, 4, 5};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.maxProfit(a));
        System.out.println(solution1.maxProfit(b));
    }
}
