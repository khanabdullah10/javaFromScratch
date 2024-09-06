package classesAndObjects.circle;

class Circle{
    float radius ;

    public Circle(float radius) {
        this.radius = radius;
    }
    public void setRadius(float r){
        this.radius = r;
    }
    void area(){
        System.out.println(3.14*(Math.pow(radius,2)));
    }
    void circumference(){
        System.out.println(2*(3.14*radius));
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.2f);
        circle.setRadius(2.3f);
        circle.area();
        circle.circumference();
    }

}
