package leetcode;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 3, 2, 4 }, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(j);
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
            System.out.println(i);
        }
        return null;
    }
}
