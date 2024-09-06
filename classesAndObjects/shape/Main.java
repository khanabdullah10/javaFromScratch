package classesAndObjects.shape;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Rectangle rec = new Rectangle(5.7,2.5);

        System.out.println("Area of Rectangle : "+rec.area());

        System.out.println("Perimeter of Rectangle : "+rec.perimeter());

        System.out.println();

        Circle circle =  new Circle();

        circle.setRadius(3.8);

        System.out.println("Area of Circle : "+circle.area());

        System.out.println("Perimeter of Circle : "+circle.perimeter());

        System.out.println();

        Triangle traingle = new Triangle(5.3,4.2,9.5);

        System.out.println("Area of Triangle : "+traingle.area());

        System.out.println("Perimeter of Triangle : "+traingle.perimeter());

    }

}
