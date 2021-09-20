class Scratch {
    public static void main(String[] args) {
        
    }
}

class Car {

    int fuel = 0;
    int fuelEfficiency;

    private Car(int fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
    }

    private void addGas(int addFuel){
        fuel += addFuel;
    }
    private void getGasLevel(){
        System.out.println("Gas level is "+ fuel);
    }

    private void drive( int distance){

        int fuelConsumption = distance/fuelEfficiency;

        if((fuel - fuelConsumption)< 0) {
            System.out.println("You don`t have enough fuel");
        } else {
            fuel -= fuelConsumption;
            System.out.println("You drove " + distance + " km");
        }
    }
}