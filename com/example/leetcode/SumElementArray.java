package leetcode;

import java.util.Arrays;

public class SumElementArray {

    /*
     * input 1, 2, 3, 4, 5
     * {1, 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10, 10 + 5 = 15}
     * output 1, 3, 6, 10, 15
     */
    public static void main(String[] args) {
        int[] result = runningSum(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(Arrays.toString(result));
    }

    private static int[] runningSum(int[] num) {
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        return num;
    }

}
