import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Scratch {
    public static void main(String[] args) {

       ArrayList<Integer> arr = random20Tosses();
        List<Integer> list = Arrays.asList(1,2,5,5,3,1,2,4,3,2,2,2,2,3,6,5,5,6,3,1);

        ArrayList<Integer> testArr = new ArrayList<>();
        testArr.addAll(list);

        showLongestRun(arr);
    }

    private static void showLongestRun(ArrayList<Integer> arr) {

        int currentRunCounter = 0;
        int maxRun = 0;
        int beginRunIndex = 0;
        int tempBeginIndex = 0;
        int endRunIndex = 0;
        int nextElement = 0;
        boolean startCount = false;

        boolean lastElement = false;

        for (int i = 0; i < arr.size(); i++) {
            if(i == arr.size()-1) {
                lastElement = true;
            } else {
                nextElement = arr.get(i + 1);
            }

            if(arr.get(i) == nextElement && !lastElement && !startCount) {
                currentRunCounter ++;
                startCount = true;
                tempBeginIndex = i;

            } else if (!lastElement && arr.get(i) != nextElement && startCount) {
                if(currentRunCounter < maxRun) {
                        currentRunCounter = 0;
                        startCount = false;
                }else if(maxRun == currentRunCounter) {
                    startCount = false;
                    currentRunCounter = 0;
                }
                else if (currentRunCounter > maxRun){
                    maxRun = currentRunCounter;
                    currentRunCounter = 0;
                    startCount = false;
                    beginRunIndex = tempBeginIndex;
                    endRunIndex = i;
                }

            } else if (!lastElement && startCount && arr.get(i) == nextElement) {
                currentRunCounter++;
            }
        }

        arr.add(beginRunIndex,0);
        arr.add(endRunIndex+2,9);

        String str = arr.toString();
        str = str.replace('0','(')
                .replace(',',' ')
                .replace('[',' ')
                .replace('9', ')')
                .replace(']',' ');

        System.out.println(str);
    }

    private static ArrayList<Integer> random20Tosses() {
        Random rn = new Random();
        int low = 1;
        int high = 7;
        ArrayList<Integer> arr =  new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            arr.add( rn.nextInt(high-low) + low);
        }
        return arr;
    }
}