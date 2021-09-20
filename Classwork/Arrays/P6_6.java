class Scratch {
    public static void main(String[] args) {
        int[] arr = {1,4,9,16,9,7,4,9,11};

        boolean isMinus = true;
        boolean lastElement = false;
        int sum = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            int nextElem = 0;
            if(i == arr.length-1) {
                lastElement = true;
            }
            else {
                nextElem = arr[i+1];
            }

            if(!lastElement && isMinus){
                sum -= nextElem;
                isMinus = false;
            } else if (!lastElement && !isMinus){
                sum += nextElem;
                isMinus = true;
            }
        }

        System.out.println("Alternating sum = " + sum);
    }
}