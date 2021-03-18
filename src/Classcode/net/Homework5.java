package Classcode.net;

    public class Homework5 {
        public static void main (String[] args) {

            // Due: March 11th

            String fullName = "happy Path to path";
            /**
             * 1. Does first name start with 'K' (ignore cases)
             * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
             *      else print, "No last name entered"
             * 3. If user has a last name, print the 1st letter of last name
             *      else print, "No last name entered"
             * 4. Print the number of letters in the first name.
             */
            //#1 way
            String[] split_name = fullName.split(" ");
            boolean first_name = split_name[0].toUpperCase().startsWith("K");
            System.out.println("");

            //#2 way
            boolean doesMyNameStartWith = fullName.trim().toUpperCase().startsWith("K");
            System.out.println("");

            //Second Scenario:
            String[] split_my_fullName = fullName.split(" ");

            if (split_my_fullName.length >=2){

                //boolean lastName_EndsWith_a =   fullName.trim().toLowerCase().endsWith("a");

               int lastIndex =  split_my_fullName.length-1;
               String lastName = split_my_fullName [lastIndex];
              boolean lastNameEndWith_a = lastName.toLowerCase().endsWith("a");


            }else {
                System.out.println("No Last Name Entered");
            }


            /*int find_lastName_length =split_my_fullName.length-1;
            System.out.println(find_lastName_length);
*/















            /**
             String threeWordsSentence_1 =  "hApPY nEW yeAr";
             * sout(threeWordsSentence_1);  // hApPY nEW yeAr
             * // code
             * sout(threeWordsSentence_1);  // Happy New Year
             */
            String threeWordsSentence_1 =  "hApPY nEW yeAr";
            System.out.println("Three words sentence -->" + threeWordsSentence_1);
           String trimThreeWordsSentence_1  =threeWordsSentence_1.trim();
           System.out.println(trimThreeWordsSentence_1);
              String threeWordsToLowerCase= trimThreeWordsSentence_1.toLowerCase();
           System.out.println(threeWordsToLowerCase);
              String [] words=threeWordsToLowerCase.split("");
                System.out.println(words);




            /**
             * Create abbreviation:
             * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
             * // code
             * LSC
             *
             */

            String threeWordsSentence_2 =  "Lab sessIONS clAsses";
            String [] sentence_split = threeWordsSentence_2.split(" ");
            String abbre= sentence_split[0].substring(0)+ sentence_split[1].substring(0) + sentence_split[2].substring(0) ;

               String find_abbreviation = abbre.toUpperCase();

            System.out.println(find_abbreviation);





            /**
             * String sentence_4 = "We all are here to learn good stuff";
             * Print the number of words in the sentence.
             *
             */
            String sentence_4 = "We all are here to learn good stuff";
            String [] numOfWords = sentence_4.split(" ");

             int  find_length_numOfWords= numOfWords.length;
            System.out.println(find_length_numOfWords);


        }
    }


