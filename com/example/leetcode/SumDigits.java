package leetcode;

public class SumDigits {
    public static void main(String[] args) {
        int result = sum(1222);
        System.out.println(result);

    }

    private static int sum(int n) {
        int sumRes = 0;
        while (n != 0) {
            // Extract the last digit
            int digits = (n % 10);
            // Add the digit to the sum
            sumRes += digits;
            // remove the last digit from n
            n /= 10;
        }
        return sumRes;
    }
}
