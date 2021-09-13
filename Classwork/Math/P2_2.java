class Scratch {
    public static void main(String[] args) {
        double demAinInch = 8.5;
        double demBinInch = 11;




        double perimeterOfSheet =  (demAinInch+demBinInch)*2;
        double diagonalOfSheet = Math.sqrt(Math.pow(demAinInch, 2) + Math.pow(demBinInch,2));

        System.out.println("Sheet perimeter = " + perimeterOfSheet + "\n" + "Sheet diagonal = " + diagonalOfSheet);
    }
}