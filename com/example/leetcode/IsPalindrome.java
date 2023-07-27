package leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("ama"));
    }

    static boolean solution(String inputString) {
        String isPalindrom = "";
        for (int a = inputString.length() - 1; a >= 0; a--) {
            isPalindrom += inputString.charAt(a);
        }
        return isPalindrom.equalsIgnoreCase(inputString);
    }
}
