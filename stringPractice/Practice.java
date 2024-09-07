package stringPractice;

import java.util.ArrayList;

public class Practice {


//    public static void printEven(String string){
//
//        for(String word : string.split( " ")){
//            if(word.length() % 2 == 0){
//                System.out.println(word);
//            }
//        }
//    }


    public static void stringIsEvenOrOdd(String s){
        ArrayList<String> lstEven = new ArrayList<>();
        ArrayList<String> lstOdd = new ArrayList<>();

        int total_Even = 0;
        int total_Odd = 0;
        for(String word : s.split(" ")){


            if(word.length() % 2 == 0){
                total_Even ++;
//                System.out.printf("Even word String : %s",word);
                lstEven.add(word);

            } else if (word.length() % 2 !=0) {
                total_Odd++;
//                System.out.printf("Odd word String : %s",word);
                lstOdd.add(word);
            }
        }
        System.out.println();
        System.out.print("1)  Even word Strings : ");
        System.out.print(lstEven);

        System.out.print("\n2)  Odd word Strings : ");
        System.out.print(lstOdd +" \n");

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("  Total number of Even Strings are : %d ", total_Even);
        System.out.printf("\n  Total number of Odd Strings are : %d ", total_Odd);
        System.out.println();

    }

    public static void main(String[] args) {
        stringIsEvenOrOdd("Hey my name is Khan and I'm not a terrorist");
    }

}
