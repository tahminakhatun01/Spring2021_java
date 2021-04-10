package Classcode.net;

import java.util.Arrays;

public class HomeWork7 {

    public static void main(String args[]) {

        // Due: Mar 18, 2021
        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        String sentence1 = "hApPY nEW yeAr";
        System.out.println(sentence1);

        String[] array_sentence1 = sentence1.trim().split(" ");
        String sentences = " ";

       /* String sentences1=  array_sentence1[0].substring(0,1).toUpperCase() + array_sentence1[0].substring(1).toLowerCase() + " ";  //Happy

        String sentence2 =sentences1+ array_sentence1[1].substring(0,1).toUpperCase() + array_sentence1 [1].substring(1).toLowerCase()+ " "; //New

        String sentences3 = sentence2 + array_sentence1 [2].substring(0,1).toUpperCase() + array_sentence1[2].substring(1).toLowerCase();//Year


        System.out.println(sentences3);*/

        for (int i = 0; i < array_sentence1.length; i++) {
            sentences = sentences + array_sentence1[i].substring(0, 1).toUpperCase() + array_sentence1[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(sentences);

        // System.out.println(Arrays.array_sentence1toString(array_sentence1));


        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */


        String threeWordsSentence_2 = "Lab sessIONS clAsses";
        String[] sentence_split = threeWordsSentence_2.trim().split(" "); // Lab, sessIONS, clAsses
        String abbre = "";
/*

           abbre= abbre+ sentence_split[0].substring(0,1).toUpperCase(); //L
          abbre= abbre+sentence_split[1].substring(0,1).toUpperCase(); //S
         abbre= abbre+sentence_split[2].substring(0,1).toUpperCase(); //C
*/


        for (int i=0; i<sentence_split.length; i++){
            abbre = abbre+ sentence_split[i].substring(0,1).toUpperCase();
        }
        System.out.println(abbre);



        for (String word : sentence_split) {
            abbre= abbre+ word .substring(0,1).toUpperCase();

        }

        /**
         * Reverse a string
         *
         */
        // String sentence3 = "happy holidays";
        //String reverseSentence3 = "";
        // System.out.println("sentence3 : " );     // happy holidays
        // code
        //System.out.println("Reverse sentence3 : " );  // syadiloh yppah

        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println(sentence3);     // happy holidays

        String[] split_sentence3 = sentence3.trim().split(""); // [h,a,p,p,y," ", h.....]

       /*reverseSentence3= split_sentence3 [split_sentence3.length-1];
        reverseSentence3= split_sentence3 [split_sentence3.length-2];
*/

       // reverseSentence3 = split_sentence3 [split_sentence3.length-split_sentence3.length];

        for (int i=0 ; i< split_sentence3.length; i++){

            reverseSentence3= reverseSentence3+ split_sentence3 [split_sentence3.length-1-i];
        }
        System.out.println(reverseSentence3); // question: why cant i get "h" printed?







    }
}