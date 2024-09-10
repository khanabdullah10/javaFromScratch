package src.stringPractice;

public class StringPalindrome {

    static void  stringIsPalindrome(String s){

        s = s.toLowerCase();
        boolean flag = true;

        for(int i = 0; i < s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) flag =false;
            else flag = true;
        }

        if (flag == true) System.out.println("String is palindrome");
        else System.out.println("String is not a palindrome");

    }


    public static void main(String[] args) {

        String s = "Kayak";
        stringIsPalindrome(s);

    }

}
