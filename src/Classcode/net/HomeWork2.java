package Classcode;

public class HomeWork2 {

    /**

     Due: Thursday Feb 25

     Store below scenario value in an appropriate dataType variable, and print the same in console.
     1. number of hours in a day (byte)
     2. max no. of days in an year
     3. total number of employees in an organization
     4. population in a country
     5. interest rate
     6. balance in a bank account
     7. does the sun rise from the west? Store answer
     8. initials of your name (^Use: char)
     */

    public static void main (String [] args){

        byte numOfHours = 24;

        System.out.println( "number of hours in a day: " + numOfHours );


        long numOfDays = 365111111111L;

        System.out.println("max number of days in a year: " + numOfDays);


        short numOfEmployee = 1211;

        System.out.println("total number of employees in the organization: " + numOfEmployee);

        int numOfPopulation = 843433434;

        System.out.println("Population in the country: " + numOfPopulation);

        float intRate = 2.5444555555555555533388888888f;

        System.out.println ("Interest Rate: " + intRate);

        double bankBal = 20999999999992000000.000988989898;

        System.out.println("balance in a bank account: " + bankBal);


        boolean doesSunRise = false;

        System.out.println( "does the sun rise from the west?: " + doesSunRise);

        char firstInit = 'a';
        char lastInit = 'b';

        System.out.println("My initials are: " + firstInit + "." + lastInit);





    }
}
