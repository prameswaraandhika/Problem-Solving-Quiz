package leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int res = maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        System.out.println(res);
    }

    private static int maxProfit(int[] nums) {
        if (nums.length == 1) {
            System.out.println("length 0");
            return 0;
        }
        int profit = 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] > nums[left]) {
                profit = Math.max(profit, nums[right] - nums[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }
}
