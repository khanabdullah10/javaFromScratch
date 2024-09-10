package src.stringPractice;

public class TotalNumberOFCharacters {



    static String removeSpace(String s){
        s = s.replace(" ","");
        return s;


    }

    public static void main(String[] args) {

        String s = "Khan Abdullah";

        System.out.println("Orignal String :  " + s);
        System.out.println("Removing spaces : " +  removeSpace(s));

        System.out.println("Therefore the length is : " + removeSpace(s).length() );



    }
}
