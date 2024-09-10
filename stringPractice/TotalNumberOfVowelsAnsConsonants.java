package src.stringPractice;

public class TotalNumberOfVowelsAnsConsonants {

    static void countVowelsAndConsonants(String s) {

        s = s.toLowerCase();
        int cCount = 0;
        int vCount = 0;

        if(s!="null") {

            for (int i = 0; i < s.length(); i++) {


                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                    vCount++;
                else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') cCount++;

            }
            System.out.println("Number of vowels in a String are : " + vCount);
            System.out.println("Number of consonants in a String are : " + cCount);
        } else {
            System.out.println("String is empty");
        }
    }


    public static void main(String[] args) {
        String s =  "This is a really simple sentence";
        countVowelsAndConsonants(s);

    }
}
