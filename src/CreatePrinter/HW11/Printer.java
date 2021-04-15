package CreatePrinter.HW11;

public class Printer {

    private final int maxPages = 100;
    private final int maxToner = 100;
    private String name = "Default Printer Name";

    private int currentPaperCount, currentTonerCount;


    public Printer (){ }

    public Printer (String pName){

        name = pName;
    }


    public void addName(String printerName){

        name = printerName;

    }


    /**
     * print for single side
     * input: 1 int papers to print
     * return type : int[]
     *
     *
     * papersToPrint <= currentPaperCount
     * paperToprint >0
     *
     * papersToPrint <= currentTonerCount
     *
     *
     * currentPaperCount = currentPaperCount - papersToPrint
     * currentTonerCount = currentTonerCount - papersToPrint
     *
     * else: Invalid papersToPrint
     *
     * */

    public int[] print (int papersToPrint){

        if (papersToPrint>0 && papersToPrint <= currentPaperCount && papersToPrint <= currentTonerCount){
            currentPaperCount = currentPaperCount - papersToPrint;
            currentTonerCount = currentTonerCount - papersToPrint;

        } else {
            System.out.println("Invalid papers to print:"+ papersToPrint);

        }

        int [] currentStates = {currentTonerCount, currentPaperCount};

        return currentStates;

    }



    /**
     * //not able to print doubledSided
     *
     * */
    public int[] printDoubleSided (int papersToPrint){

        if (papersToPrint>0 && papersToPrint <= currentPaperCount && papersToPrint <= currentTonerCount){
            currentPaperCount = currentPaperCount - papersToPrint;
            currentTonerCount = currentTonerCount - papersToPrint;

        } else {
            System.out.println("Invalid papers to print:"+ papersToPrint);

        }

        int [] currentStates = {currentTonerCount, currentPaperCount};

        return currentStates;

    }



    public void printSummary (){

        System.out.println(currentPaperCount+ currentTonerCount);
    }





}
