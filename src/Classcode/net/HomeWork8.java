package Classcode.net;

public class HomeWork8 {


    public static void main(String[] args) {
        // Due March 22
        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total=0;

    for (int i=0; i<doubleArray.length; i++){

        total=total+doubleArray[i];

        System.out.println(total);


    }

        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */

        String word = "lEvl";

       String pelindromeWord = "";
       String[]splitWord =word.trim().toLowerCase().split("");

    for (int i=0; i<splitWord.length;i++) {


        pelindromeWord = pelindromeWord + splitWord[splitWord.length - 1 - i];


    }
        System.out.println(pelindromeWord);

        boolean isPelindrome=word.equalsIgnoreCase(pelindromeWord);
        System.out.println("is "+word+" a pelindrome: "+ isPelindrome);



          /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */



        int number = 25;


        if (number%2 !=0){

            int isPrime =number;

            System.out.println(isPrime);


        } else {
            System.out.println("not a prime number");
        }


    }
}
