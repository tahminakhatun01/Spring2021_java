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


            System.out.println( tellStudentGrade(91,100));



            /**
             * Write a method that will reverse any given int-array
             */
            int [] Array = {10, 20,30, 40};
            System.out.println(Arrays.toString(reverseIntArray(Array)));



            /**
             * Write a method that return the number of words in given sentence.
             *
             */
            System.out.println(returnNumberOfWords("we are good"));


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

    public static String tellStudentGrade (double studentScore, double MaxScore) {

        //double studentScore = 100;
       // double maxScore = 700;
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z

        String yourGrade= "";

        double score_student = studentScore / MaxScore;
        double final_student = score_student * 100;

        System.out.println("your final Score:" + final_student);

        if (final_student >= 91) {
            yourGrade = "Grade A";
            //System.out.println("Grade A");


        } else if (final_student >= 81) {

            yourGrade = "Grade B";
            //System.out.println("Grade B");


        } else if (final_student >= 71) {
            yourGrade = "Grade C";
            //System.out.println("Grade C");


        } else if (final_student >= 61) {
            yourGrade = "Grade D";

            //System.out.println("Grade D");


        } else if (final_student >= 51) {

            yourGrade = "Grade E";
            //System.out.println("Grade E");


        } else if (final_student <= 50) {
            yourGrade = "Grade F";
            //System.out.println("Grade F");


        } else {
            yourGrade = "No grade";
            //System.out.println("No grade");
        }

        return yourGrade;
    }


    /**
     * Write a method that will reverse any given int-array
     */

    public static int [] reverseIntArray (int [] number) {
        int[] revNumber = new int[number.length];
      for (int i=0; i <number.length; i++){

           revNumber [i]= number[number.length-1-i];


      }


    return revNumber;

    }
    /**
     * Write a method that return the number of words in given sentence.
     *
     */

    public static String []numberOfWords(String [] sentence){
        //are there index of three 'happy' present in given array
        String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};

        int counter =0;
        for(int i=0; i<myWords.length; i++) {


            if (myWords[i].equalsIgnoreCase("happy")) {

                counter++;
            }
        }

        int [] storeMyWord = new int [counter];
        return sentence;
    }




    /**
     * Write a method that return the number of words in given sentence.
     *
     */
    //String sentence_4 = "We all are here to learn good stuff";

    public static int returnNumberOfWords(String sentence) {
        String[] numOfWords = sentence.split(" ");

        int find_length_numOfWords = numOfWords.length;
        System.out.println(find_length_numOfWords);

        return find_length_numOfWords;
    }




}


