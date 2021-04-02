package Classcode.net;

import java.util.Arrays;

public class HomeWork9 {



        public static void main(String[] args) {
            // Due: Mar 25, 2021
            /**
             * Write a method to convert given string into Titlecase
             */

            System.out.println(toTitleCase("happY   Holidays to you"));
            System.out.println(toTitleCase(""));
            System.out.println(toTitleCase("happY Holidays"));
            System.out.println(toTitleCase("happY Holidays"));
            System.out.println(toTitleCase("happY Holidays"));


            /**
             * Write a method that will tell grade to student for given score and MaxScore
             */





            /**
             * Write a method that will reverse any given int-array
             */


            int [] Array = {10, 20,30, 40};

            System.out.println(Arrays.toString(reverseIntArray(Array)));
            /**
             * Write a method that return the number of words in given sentence.
             */
        }

        /**
         * Write a method to convert given string into Titlecase
         */


        public static String toTitleCase(String myString) {

            if (myString.trim().length() >0) {

                String[] myStringArray = myString.trim().split("\\s+");

                myString = "";

                for (int i = 0; i < myStringArray.length; i++) {
                    myString = myString + myStringArray[i].substring(0, 1).toUpperCase() + myStringArray[i].substring(1).toLowerCase() + " ";
                } }

            else {

                    myString = "please Enter a valid string";
                }



            return myString;


        }

    /**
     * Write a method that will tell grade to student for given score and MaxScore
     */

    public static int [] reverseIntArray (int [] number) {
        int[] revNumber = new int[number.length];
      for (int i=0; i <number.length; i++){

           revNumber [i]= number[number.length-1-i];


      }


    return revNumber;

    }




    }


