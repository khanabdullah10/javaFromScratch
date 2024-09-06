package classesAndObjects.shape;

class Circle extends Shape {

    private double radius;

    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double area() {

        return Math.PI * Math.pow(radius, 2);

    }

    double perimeter() {

        return 2 * Math.PI * radius;

    }
}
