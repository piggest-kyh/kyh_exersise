class Scratch {
    public static void main(String[] args) {

    }
}


    class ComboLock {

        int secret1;
        int secret2;
        int secret3;
        int input1 = 0;
        int input2 = 0;
        int input3 = 0;
        int currentPosition = 0;
        int currentSpin = 1;

        public ComboLock(int secret1 , int secret2 , int secret3) {
            this.secret1 = secret1;
            this.secret2 = secret2;
            this.secret3 = secret3;
        }

        public void reset() {
            input1 = 0;
            input2 = 0;
            input3 = 0;
            currentPosition = 0;
            currentSpin = 1;
        }

        public void turnLeft(int ticks) {
            int result;

            result = currentPosition - ticks;
            if (result < 0) {
                System.out.println("You can`t turn to this position");
            } else {
                currentPosition = result;
                if(currentSpin == 2){
                    input1 = currentPosition;
                }
                currentSpin++;
            }
        }

        public void turnRight(int ticks) {
            int result;
            result = currentPosition + ticks;
            if (result > 39) {
                System.out.println("You can`t turn to this position");
            } else {
                currentPosition = result;
                if(currentSpin == 1){
                    input1 = currentPosition;
                } else if (currentSpin == 3) {
                    input3 = currentPosition;
                }
                currentSpin++;
            }
        }

        public boolean open(){
            if(input1 == secret1 && input2 == secret2 && input3 == secret3) {
                System.out.println("Lock was opened");
                return true;
            } else {
                System.out.println("You can`t open the lock");
                return false;
            }
        }
    }
