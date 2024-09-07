package src.sixtyQuestionPractice.classesAndObject;

class A1
{
    int i;

    static
    {
//        System.out.println(i);
//        This statement will show Compilation error reason behind it is that the non-static
//        field cannot be accessed inside a static initialization block
    }
}


//static initialization block cannot contain nested static initialization block
//this code wil show compilation error
class A2
{
    static
    {
//        static
//        {
//            System.out.println(1);
//        }
    }
}


//The code below contains only two static blocks
class A3
{
    static int a = 50;

    static
    {
        a = 50;
    }

    static
    {
        a = 50;
    }
}


