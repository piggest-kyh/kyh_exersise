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
    public BetterRectangle(int locationX, int locationY, int width, int height){

        super(locationX,locationY,width,height);
        super.setLocation(locationX, locationY);
        super.setSize(width,height);
    }

    int getPerimeter(){
        return (x+y)*2;
    }

    int getArea(){
        return x*y;
    }
}