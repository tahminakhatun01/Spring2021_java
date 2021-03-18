package Classcode;

public class HomeWork3 {

    /**
     * Homework #3:
     * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
     *
     * C -> F
     * C -> K
     *
     * F -> C
     * F -> K
     *
     * K -> F
     * K -> C
     *
     */


    public static void main (String [] args){

        //T(°F) = T(°C) × 9/5 + 32

        //T(°C) = (T(°F) - 32) × 5/9

        //T(K) = T(°C) + 273.15


        double cTemp = 20.1;
       double fTemp = cTemp * 9/5 + 32;
       System.out.println("Today's temperature in Fahrenheit: " +fTemp);


       double kTemp = cTemp + 273.15;
        System.out.println("Today's temperature in Kelvin: " + kTemp);


       // T(°C) = (T(°F) - 32) × 5/9
        double fahrTemp = 39.3;
        double celsiusTemp = (39.3 - 32) * 5/9;
        System.out.println("Today's temperature in Celsius: "+ celsiusTemp);

        //T(K) = (T(°F) + 459.67)× 5/9
        double kelvin = (fahrTemp + 459.67) * 5/9;
        System.out.println( "Today's Temp in kelvin converted from fahrenheit: " +kelvin);

        //T(°F) = T(K) × 9/5 - 459.67

         double fahrenheit = kelvin * 9/5 - 459.67;
         System.out.println("Today's Temp in fahrenheit converted from kelvin: " + fahrenheit);


        //T(°C) = T(K) - 273.15

        double celsiusT = kelvin - 273.15;
        System.out.println("Today's Temp in celsius converted from kelvin: " + celsiusT);







    }

}
