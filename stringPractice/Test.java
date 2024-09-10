package src.stringPractice;

public class Test {
    public static void main(String[] args) {
        String s = "Hello"; //String literal - creates object inside the heap memory(String Constant Pool) and reference variable s at Stack
        String s1 = new String("World"); // String by new - creates two object inside the heap memory
        char[] c = {'h','e','y'};
        String s2 = new String(c);
        String s3 = "hello";

//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);

        //Methods

        System.out.println(s.charAt(3));
        System.out.println(s.getBytes());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("o"));
        System.out.println(s.length());
        System.out.println(s.compareTo(s3));
        System.out.println(s.compareToIgnoreCase(s3));

    }
}
