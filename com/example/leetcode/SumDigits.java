package leetcode;

public class SumDigits {
    public static void main(String[] args) {
        int result = sum(1222);
        System.out.println(result);

    }

    private static int sum(int n) {
        int sumRes = 0;
        while (n != 0) {
            System.out.println(n);
            // Extract the last digit
            int digits = (n % 10);
            // Add the digit to the sum
            sumRes += digits;
            // remove the last digit from n
            n /= 10;
        }
        /*
         * input = 1222
         * in loop 1 = sumRes = 2, it will removing last digits
         * input = 122
         * in loop 2 = sumRes = 4, it will removing last digits
         * input = 12
         * in loop 3 = sumRes = 6, it will removing last digits
         * input = 1;
         * in loop 4 = sumRes = 7, it will removing last digits
         * input = 0;
         * if n == 0, break
         */
        return sumRes;
    }
}
