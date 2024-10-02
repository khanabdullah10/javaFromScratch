package java8.functionalInterface.multipleInterface;
/**
 * How to solve ambiguity problem
 **/

interface Left{
    default void m1(){
        System.out.println("Default method from Left");
    }
}

interface Right{
    default void m1(){
        System.out.println("Default method from Right");
    }
}
public class Demo implements Left,Right{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();

    }
    @Override
    public void m1() {
        System.out.println("Hello");
        Left.super.m1();
    }
}
