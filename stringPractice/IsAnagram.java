package src.stringPractice;

public class IsAnagram {


    static void  sort(char[] arr){
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]> arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char)temp;
                }else arr[i] = arr[i];
            }
        }
    }

    static void isAnagram(String s1, String s2){

        boolean flag = true;

        s1 = s1.toLowerCase();
        s2 = s1.toLowerCase();

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        if(s1.length() != s2.length()){
            flag = false;
            System.out.println("Strings are not anagram");
        }
        else {
            flag = true;
            sort(str1);
            sort(str2);

        }

        if (flag == true) System.out.println("Both the Strings are anagram !");
        else System.out.println("Strings are not anagram !");

    }


    public static void main(String[] args) {
//        int[] arr = {29,21,24};
//        sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ,");
//        }

        String s1 = "Brag";
        String s2 = "Grab";

        System.out.println("String 1 : "+s1);
        System.out.println("String 2 : "+s2);
        System.out.println();
        System.out.print("Result : ");

        isAnagram(s1,s2);

    }

}
