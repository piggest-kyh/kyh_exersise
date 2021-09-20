class Scratch {
    public static void main(String[] args) {
        Bug baggsy = new Bug(10);

        baggsy.move();
        baggsy.turn();
        baggsy.move();
        baggsy.move();
        baggsy.move();
        baggsy.getPosition();
    }
}

class Bug{

    private int position;
    boolean isDirectionToRight = true;

    public Bug(int initialPosition){

        this.position = initialPosition;
    }

    public void move() {
        if(isDirectionToRight){
            position++;
        } else {
            position--;
        }
    }

    public void turn(){
        isDirectionToRight = !isDirectionToRight;
    }

    public void getPosition(){
        System.out.println("Current position is " + position);
    }
}