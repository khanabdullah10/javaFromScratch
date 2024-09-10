package src.stringPractice;

public class TotalNumberOfPunctuationCharacters {

    static void countPunctuation(String str){
        int count = 0;
        for(int i =0 ;  i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                count ++;
            }
        }

        System.out.println("\nThere are total "+count +" number of punctuation in a given string");

    }

    public static void main(String[] args) {

        String s = "He said, 'The mailman loves you.' I heard it with my own ears.";

        countPunctuation(s);

    }
}
