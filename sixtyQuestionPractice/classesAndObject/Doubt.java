package src.sixtyQuestionPractice.classesAndObject;

public class Doubt {
// value can be assigned before declaring a field
    {
        a = 10;
    }

    int a ;


// Cannot read the value before the field's definition
    {
//        System.out.println(b);
    }
    int b = 30;


//    Compilation error:- unexpected token
//    x = 500;
//    int x;

    static int method(int i){
        i = i-- - ++i;
        return i;
    }

    public static void main(String[] args) {
        int i = 11;
       int j= method(i);
        System.out.println(j);

        int x = 10;
        ++x;
        System.out.println(x);
    }

}
