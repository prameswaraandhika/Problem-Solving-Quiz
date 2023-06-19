import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Problem: Given an ArrayList of strings, remove all strings that start with the letter "A"
 */
public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Anggur", "alpukat", "Apel", "Pisang", "Coklat", "Melon"));

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String removeValue = iter.next().toUpperCase();
            if (removeValue.startsWith("A")) {
                System.out.println("Removig " + removeValue);
                iter.remove();
            }
        }

        System.out.println(list.toString());
    }
}
