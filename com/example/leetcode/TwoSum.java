package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumFirst(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSumSecond(new int[] { 3, 2, 4 }, 6)));
    }

    private static int[] twoSumSecond(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int res = target - nums[j];
            if (!maps.containsKey(res)) {
                maps.put(nums[j], j);
            } else {
                return new int[] { j, maps.get(res) };
            }
        }
        return null;
    }

    public static int[] twoSumFirst(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { j, i };
                }
            }
        }
        return null;
    }
}
