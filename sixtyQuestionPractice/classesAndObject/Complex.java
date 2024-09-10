package src.sixtyQuestionPractice.classesAndObject;

 class Sup
{
    int m;

    double n;

    public Sup(int i)
    {
        m = i;
    }

    public Sup(double d)
    {
        n = d;
    }

    {
        System.out.println(m);

        System.out.println(n);
    }

    public static void main(String[] args)
    {
        Sup a1 = new Sup(500);

        Sup a2 = new Sup(50.0);

        System.out.println(a1.m+" : "+a1.n);

        System.out.println(a2.m+" : "+a2.n);
    }
}











public class Complex {
    int a,b;
    static int plus(int x, int y){
//       int c  = a + b;

        Complex a = new Complex();

        a.a = x;
        a.b = y;
        return x + y;

    }
}
class ClassOnee
{
    {
        s = "second";
    }

    String s = "first";

    {
        System.out.println(s);

        s = "third";
    }

    public ClassOnee()
    {
        System.out.println(s);
    }

    public ClassOnee(String s)
    {
        System.out.println(s);

        this.s = s;
    }
}

 class ClassTwoo
{
    public static void main(String[] args)
    {
        ClassOnee one = new ClassOnee("last");

        ClassOnee two = new ClassOnee();
    }
}
