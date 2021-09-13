class Scratch {
    public static void main(String[] args) {
        double demAinInch = 8.5;
        double demBinInch = 11;

//        Convert inch in mm.
//        inch -> mm factor = 25.4
        double factor =  25.4;

        double sheetDimensionInMillimeter = (demAinInch*factor)*(demBinInch*factor);

        System.out.println("Sheet dimension in mm = " + sheetDimensionInMillimeter);
    }
}