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
        System.out.print("result: ");
        System.out.println(Arrays.toString(result));
    }

    private static int[] runningSum(int[] num) {
        int[] arr = new int[num.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("first index " + num[i]);
                arr[i] = num[i];
                System.out.println("first index " + arr[i]);
                System.out.println(Arrays.toString(arr));
            } else {
                System.out.println(arr[i - 1] + " + " + num[i]);
                arr[i] = arr[i - 1] + num[i];
            }
        }
        return arr;
    }
}
