public class Exercise2 {
    public static void main(String[] args) {
        /*
         * Write a program that convert a String to Integer vice versa
         */

        String a = "23";
        System.out.println(a.getClass().getSimpleName());
        int integerOfA = (Integer.class.isInstance(Integer.parseInt(a))) ? Integer.parseInt(a) : 0;
        System.out.println("value : " + integerOfA);

        Integer b = 100;
        System.out.println(a.getClass().getSimpleName());
        String stringOfB = (String.class.isInstance(String.valueOf(b))) ? String.valueOf(b) : null;
        System.out.println("value : " + stringOfB);
    }
}
