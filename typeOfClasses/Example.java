package typesOfClasses;

//Concrete class OR Regular class: - Fully implementation class that can be access without any barrier!
class Car{
    String name = "khan";
    int seats;

    public void display(String name, int seats){
        this.name = name;
        this.seats = seats;
        System.out.printf(" Care name : %s \n Total seats : %d",name,seats);
    }
}

// Abstract class: - Hiding internal details and showing functionality
// It cannot be instantiated (Object of that class cannot be created).
// Does contain constructor
// It is used to define common behavior for sub_classes which can be access through
// inheritance and override all the non_implemented method present inside the Abstract class
// Can contain abstract method as well as concrete method
abstract class Vehicle{


    abstract void start();
    abstract void stop();

    void hello(){
        System.out.println("Hello !");
    }

} class CarAlto extends Vehicle{


    void start(){
        System.out.println("The car has started !");
    }
    void stop(){
        System.out.println("The car has stopped !");
    }

    @Override
    void hello() {
        super.hello();
    }
}

//Interface: - It is a way to achieve abstraction mechanism
// Blueprint of a class that cannot be instantiated
//Cannot create constructor
//It is used to define some common property as a base class
//where all the subclasses can access through implementing the unimplemented methods
//Only abstract method can be declared inside an interface
interface Shape{

    void type();
    void color();


}class Trial implements Shape{
    @Override
    public void type() {
        System.out.println("Circle");
    }

    @Override
    public void color() {
        System.out.println("Black");
    }
}


//The Special type of class used to defined collection of constants
//All fields inside the enum class is by default static and final
 enum Day{
     MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
        }

 class Test{
      Day day;

      Test(Day day){
          this.day = day;
      }

      public void brief(){
          switch(day){

              case MONDAY :
                  System.out.println("Monday is bad");
                  break;
              case FRIDAY:
                  System.out.println("Friday is better");
                  break;
              case SUNDAY: case SATURDAY:
                  System.out.println("Weekends are good");
                  break;
              default:
                  System.out.println("Boring day");


          }
      }

 }


// Inner_Class :- Class defined within another class called as nested class
// It has access to outer class attribute even if they are private
// Inner class can access every field of an outer class even the private fields
// Similarly the outer class can access the inner field include the private attribute
// only by creating the instance of the inner class
// Private inner class can be access from the outer class since it is defined within the scope of the outer class
class OuterClass{
    private String outerField = "\"outer\"";

//    void display(){
//        System.out.println("This is the outer classs");
//    }

    class InnerClass{

        private String innerField = "\"inner\"";

        void accessOuter(){
            System.out.println("Accesing the outer field "+ outerField );
        }



//        void display(){
//            System.out.println("This is an innner class!");
//        }
    }
    void accessInner(){
        InnerClass inner = new InnerClass();
        System.out.println("Accesing the inner field "+ inner.innerField );
    }

 }

// Method Local inner class
class Out{

    void methodLocal(){
        int n = 10;
        class In{
            void print(){
                System.out.println("This is the local method inner class");
            }
        }
        In obj = new In();
        obj.print();
    }


}




public class Example {
    public static void main(String[] args) {
//        1)concrete class
//        new Car().display("Alto ",4);

//        2)abstract class
//        new CarAlto().hello();

//        3)interface
//        new Trial().color();

//        4)enum class
      /* Test day = new Test(Day.MONDAY);
        day.brief();
        Test day1 =  new Test(Day.TUESDAY);
        day1.brief();
        Test day2 =new Test(Day.SUNDAY);
        day2.brief(); */

//       5) Nested - inner class
       /* OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
        outer.accessInner();*/

        Out out = new Out();
        out.methodLocal();





    }

}
