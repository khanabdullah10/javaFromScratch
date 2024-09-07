package src.sixtyQuestionPractice.classesAndObject;

//Execution flow of a program: -
//First static block in sequential order
//Second if a class Instance is created than Initialization block will execute in sequential order
//Constructor will be executed after the init block
public class InstanceVsStaticInitializationBlock {
    int i ;
    static int x;

    {
        i=10;
        System.out.println("Static initialization block");
    }

    static {
        x=20;
        System.out.println("Instance initailization block");
    }

    InstanceVsStaticInitializationBlock(){
        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        System.out.println("Main");
        InstanceVsStaticInitializationBlock IS = new InstanceVsStaticInitializationBlock();

        System.out.println(IS.i);
        System.out.println(x);
    }

}
