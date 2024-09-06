package classesAndObjects.rectangle;

class Rectangle{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    void area(){
        System.out.println(height*width);
    }
    void perimeter(){
        System.out.println((height+width)*2);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2,8);
        rec.area();
        rec.perimeter();
    }


}
