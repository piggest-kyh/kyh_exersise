class Scratch {
    public static void main(String[] args) {
        Area area = new Area();

        System.out.println("Rect area with param 2 and 3 = " + area.rectangleArea(2,3) +"\n"
                 + "square area with side 2 = " + area.squareArea(2) +"\n"+
                "Circle area with radius 2 = " + area.circleArea(2) +"\n");
    }
}

abstract class Shape{

    abstract double rectangleArea(double width, double height);
    abstract double squareArea(double width);
    abstract double circleArea(double radius);

}

class Area extends Shape{

    double p = 3.14;
    double rectangleArea(double width , double height) {
        return width*height;
    }

    double squareArea(double width) {
        return width*width;
    }

    double circleArea(double radius) {
        return p*Math.pow(radius,2);
    }
}