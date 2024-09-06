package classesAndObjects.shape;

class Triangle extends Shape{

    private double side_a;

    private double side_b;

    private double side_c;

    public Triangle(double side_a, double side_b, double side_c) {

        this.side_a = side_a;

        this.side_b = side_b;

        this.side_c = side_c;

    }

    public double area(){

        double s=  (side_a + side_b + side_c)/2;

        return Math.sqrt(s*(s-side_a)*((s-side_b)*(s-side_c)));

    }

    public double perimeter(){

        return side_a + side_b + side_c;

    }

}
