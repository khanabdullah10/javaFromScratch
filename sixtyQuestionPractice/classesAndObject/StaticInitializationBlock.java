package src.sixtyQuestionPractice.classesAndObject;

//1
// static initializer block: - The class loader loads the particular class,
// that contains the main method first into the memory which gives the first preference to the
// static block within the class and if try to access any static field of some distinct class,
// the class loader will load that class too, and it's irrespective static initialization block
// will execute subsequently
//If more than one object is create for the class the SIB is executed only once,
// but the initit block will executed till the number of time the obj is created for a particular class

class A
{
    static int i;

    static
    {
        System.out.println(1);

        i = 100;
    }
}

public class StaticInitializationBlock
{
    static
    {
        System.out.println(2);
    }

    public static void main(String[] args)
    {
        System.out.println(3);

        System.out.println(A.i);
    }
}