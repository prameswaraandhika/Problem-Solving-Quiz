import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String txt = "andhika";

        // Using loop
        String reverseTxt = reverseUsingLoop(txt);
        System.out.println(reverseTxt);

        // Using StringBuilder
        reverseTxt = reverseUsingStringBuilder(txt);
        System.out.println(reverseTxt);

        // Using Recursive
        reverseTxt = reverseUsingRecursive(txt);
        System.out.println(reverseTxt);

    }

    private static String reverseUsingRecursive(String txt) {
        if (txt.isEmpty()) {
            return txt;
        }
        return reverseUsingRecursive(txt.substring(1)) + txt.charAt(0);
    }

    private static String reverseUsingStringBuilder(String txt) {
        return new StringBuilder(txt).reverse().toString();
    }

    private static String reverseUsingLoop(String txt) {
        String txtReverse = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            txtReverse += txt.charAt(i);
        }
        return txtReverse;
    }

}
