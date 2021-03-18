package Classcode.net;

public class HomeWork6 {


        public static void main(String[] args) {
            /**
             * Create variable to store studentScore and maxScore;
             * Based on the percentage, display grade to student:
             * Grade A: 91-100
             * Grade B: 81-90
             * Grade C: 71-80
             * Grade D: 61-70
             * Grade E: 51-60
             * Grade F: less than or equal to 50
             */
            double studentScore = 100;
            double maxScore = 700;
            // calculate percentage
            // Your percentage: XX.yy and your Grade is: Z

           double score_student = studentScore/maxScore;
           double final_student = score_student*100;

           System.out.println(final_student);

            if (final_student>=91){

                System.out.println("Grade A");


            }else if (final_student>=81){

                System.out.println("Grade B");


            }else if (final_student>=71){

                System.out.println("Grade C");


            }else if (final_student>=61){

                System.out.println("Grade D");


            }else if (final_student>=51){

                System.out.println("Grade E");


            } else if (final_student<=50){

                System.out.println("Grade F");


            } else {

                System.out.println("No grade");
            }






            /**
             * store value in an int variable
             * if number is divisible by 3, print "divisible by 3"
             * if number is divisible by 5, print "divisible by 5"
             * if number is divisible by 3 and 5, print "divisible by both"
             * if not divisible by 3 or 5, print the number
             */

                int value = 15;

                if(value %3 ==0)
                {
                    System.out.println("divisible by 3");

                } else if(value%5==0)
                    {
                        System.out.println("divisible by 5");

                    } else if(value%3==0 && value%5==0)
                         {
                         System.out.println("divisible by 3 and 5");

                            }    else {

                    System.out.println(value);
                }

            /**
             * Checking car gear (P, D, N, R)           // switch
             * if car gear is P, display "you can park the car"
             * if car gear is D,
             *      if drive type is Snow, display "You are on Snow mode"
             *      if drive type is Sport, display "You are on Sport mode"
             *      if drive type is Eco, display "You are on Eco mode"
             * if car gear is N, display "put car in car wash"
             * if car gear is R, display  "revere the car"
             */


            char carGear = 'P';
            String driveType = "";

            switch (carGear){

                case 'p':
                case 'P':
                    System.out.println("you can park the car");
                    switch (driveType.toUpperCase())
                    {

                        case "Snow":
                            System.out.println("you are on Snow mode");
                        case "Sport":
                            System.out.println("you are on Sport mode");
                        case "Eco":
                            System.out.println("you are on Eco mode");
                    }
                case 'N':
                case 'n':
                    System.out.println("put car in the car wash");
                case 'R':
                case 'r':
                    System.out.println("Reverse the car");




            }






        }


}
