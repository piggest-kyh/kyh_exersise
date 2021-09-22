import java.awt.*;

class Scratch {
    public static void main(String[] args) {

        BetterRectangle rct = new BetterRectangle(2,4,0,0);

        int perimeter = rct.getPerimeter();
        int area = rct.getArea();
        System.out.println("Perimeter of Rect = " + perimeter +  "\nArea of Rect = " + area);
    }
}

class BetterRectangle extends Rectangle{
    int width;
    int height;

    public BetterRectangle(int width , int height , int locationX, int locationY){

        this.width = width;
        this.height = height;

        super.setLocation(locationX, locationY);
        super.setSize(width , height);
    }

    int getPerimeter(){
        return (width + height)*2;
    }

    int getArea(){
        return width * height;
    }
}
