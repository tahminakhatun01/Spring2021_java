package Classcode.net;

public class Homework4 {
    public static void main(String[] args) {

        // Due : March 8

        String sentence_3 = "hello dear, how are you?";

        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         * Hint: use ternary operator
         */

       int sentenceLength =sentence_3.length();
        int length = 10;

      boolean result = sentenceLength> length ? true : false ;
      System.out.println("length of sentence _3 is greater than 10 ----->" + result);



        String sentence_4 = "We all ARe Good ProgRommeR";
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */

       String replaceUpperCaseR= sentence_4.replace( "R", "f");
       String replaceLowerCase_r=  replaceUpperCaseR.replace("r", "f");
        System.out.println("Replaced sentence 4 to" + replaceLowerCase_r);




        String fullName = "Tahmina ";
        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */


        int fullName_length =fullName.toUpperCase().trim().length();
        boolean name = fullName.startsWith("k");
        boolean contain =fullName.contains("a");



    }
}
