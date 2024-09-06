package classesAndObjects.shape;

class Rectangle extends Shape {

    private double width;

    private double height;

    // Constructor

    public Rectangle(double width, double height) {

        this.width = width;

        this.height = height;

    }

    double area() {

        return width * height;

    }

    @Override
    double perimeter() {

        return 2 * (width + height);

    }
}