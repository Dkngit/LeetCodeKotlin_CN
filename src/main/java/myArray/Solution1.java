package myArray;

/**
 * 买卖股票的最佳时机 II
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        int j = 0;
        int sum = 0;
        while (j < prices.length-1) {
            if (prices[j] < prices[j+1]) {
                sum += prices[j+1] - prices[j];
            }
            //[7,1,5,3,6,4]
            //[1,2,3,4,5]
            j++;
        }
        return sum;
    }
}
