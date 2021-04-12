package ClassEnrollment.HW10;

public class Students {

    /*
     * variable which will store values like:
     * School name :
     * Student name:
     * Student enrolled course Name:
     * Courses offered by school:
     * total number of students
     * student fee-balance
     * student address
     * student ID
     * */

    static String SchoolName = "ABC School";
    static String[] coursesOfferedBySchool = {"QA", "web", "PM"};
    static double[] feeCourses = {1000, 2000, 3000};
    static int totalStudents = 0;


    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentID;
    String studentAddress;
    double studentFeeBalance;

    public void enrollStudent(String name, String addr, String course) {

        /*
         * if course is available in school, we should inform student the fees-balance
         * increase the total number of students
         * we should provide the student their ID
         *
         * */

        boolean isCourseAvailable = false;

        for (int i = 0; i < coursesOfferedBySchool.length; i++) {

            if (coursesOfferedBySchool[i].equalsIgnoreCase(course)) {

                totalStudents++;
                studentID = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = coursesOfferedBySchool[i];
                studentFeeBalance = feeCourses[i];
                studentAddress = addr;

                break;
            }
        }


            if (isCourseAvailable) {
                System.out.println("Enrollment done successfully + student ID ->" + studentID);
            } else {
                System.out.println("Requested course" + course + "is not available in the school");
            }



    }



    /*
    * method to display student profile
    * ID
    * Name
    * course
    *
    * */

    public void displayStudentProfile (){

        System.out.println("student ID is ->"+ studentID + "\nstudent name is "+ studentName + "\nstudent course "+ studentEnrolledCourse + "\n\n");


    }

    /*
    * method to fee deposit
    * name: feeDeposit
    input: double
    return Type : balance (double)
     */
          public double feeDeposit(double deposit) {

              studentFeeBalance =deposit+studentFeeBalance;
              return studentFeeBalance;
          }

    /*
    * Student to change course
    * Req:
    * 1. earlier deposited fees should be subtracted from new course fees
    * 2. show error (saying , same course entered) if student entered enrolled course as new course
    * 3.show error (saying , invalid course entered  entered) if student enter a course not offered by school
    *
    * student coming has requested change course to "QA"
    *
    * does course QA exist in offeredCourses = {}
    * sout {invalid course entered}
    * if the current enrolled is PM or not ? StudentEnrolledCourse
    *
    *  sout (same course entered )
    * if above two conditions are false then: StudentenrolledCourse = QA
    *
    * double courseFees = find the fees of current enrolled course
    * double deposit = courseFees - studentfeesbalance;
    * find the fees of new course
    * subtract newfees from provideDepositAmount
    *
    *
    *
    *
     * */



  public void studentChangeCourse (String courseChangeRequest){

      for (int i = 0; i < coursesOfferedBySchool.length; i++) {

          if (coursesOfferedBySchool[i].equalsIgnoreCase(courseChangeRequest)) {

              courseChangeRequest = coursesOfferedBySchool[i];

              if (courseChangeRequest != studentEnrolledCourse) {


                  for (int j =0; j<feeCourses.length; j++) {

                      double deposit =feeCourses[i] -studentFeeBalance;
                      System.out.println("amount to deposit: " + deposit);

                      break;
                  }
              }

              else {

                  System.out.println("Same course Entered");
              }

          } else {
              System.out.println("invalid course Entered ");
          }
      }

      System.out.println("your course has changed to: " + courseChangeRequest);


          }






    /*
    * static method to display school summary:
    * School Name:
    * Course offered
    * total number of student
    * */


   public static void schoolSummary(){
       System.out.println("School Name --> "+SchoolName+ "\n Courses offered: "+ coursesOfferedBySchool + "\n Total number of Student: "+ totalStudents);
   }
    //
    // }



}



















