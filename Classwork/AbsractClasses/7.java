import java.awt.*;

class Scratch {
    public static void main(String[] args) {


        Rect rect1 = new Rect(2,4);
        Rect rect2 = new Rect(5,3);
        Rect rect3 = new Rect(6,7);
        Rect rect4 = new Rect(3,8);

        Square square1 = new Square(1);
        Square square2 = new Square(2);
        Square square3 = new Square(3);
        Square square4 = new Square(4);

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(4);
        Circle circle5 = new Circle(5);

        Shape[] shapes = {rect1,rect2,rect3,rect4,square1,square2, square3, square4, circle1,circle2,circle3,circle4,circle5};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }

    }
}

abstract class Shape{

    abstract double rectangleArea();
    abstract double squareArea();
    abstract double circleArea();

    public abstract String toString();

}

class Rect extends Shape{
    double width;
    double height;

    public Rect(double width, double height){
        this.width = width;
        this.height = height;
    }

    double rectangleArea() {
        return width*height;
    }

    double squareArea() {
        return width*width;
    }

    double circleArea() {
        return 0;
    }

    @Override
    public String toString() {
        return ("The area of rect with sides "+ width + " and "+ height + " = " + rectangleArea());
    }
}

class Square extends Shape{
    double width;


    public Square(double width){
        this.width = width;
    }

    double rectangleArea() {
        return 0;
    }

    double squareArea() {
        return width*width;
    }

    double circleArea() {
        return 0;
    }

    @Override
    public String toString() {
        return ("The area of square with width "+ width + " = " + squareArea());
    }
}

class Circle extends Shape{
    double radius;
    double p = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    double rectangleArea() {
        return 0;
    }

    double squareArea() {
        return 0;
    }

    double circleArea() {
        return p*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return ("The area of circle with radius "+ radius + " = " + circleArea());
    }
}