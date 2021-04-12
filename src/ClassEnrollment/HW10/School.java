package ClassEnrollment.HW10;

public class School {
    public static void main (String [] args) {


        Students student1 = new Students();
        /*
        * static String SchoolName ="ABC School";
    static String [] coursesOfferedBySchool = {"QA", "web", "PM"};
    static double [] feeCourses = {1000,2000,3000};
    static int totalStudents =0;



    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentID;
    String studentAddress;
    double studentFeeBalance;
        * */

        student1.enrollStudent("tami", "Ny", "PM");
        student1.studentChangeCourse("QA");


        /*
        *
    static int totalStudents =1;
    String studentName = "tami";
    String studentEnrolledCourse= pm;
    int studentID = 1 ;
    String studentAddress = "Ny";
    double studentFeeBalance = 3000;
        * */


        Students student2 = new Students();


         /*
        * static String SchoolName ="ABC School";
    static String [] coursesOfferedBySchool = {"QA", "web", "PM"};
    static double [] feeCourses = {1000,2000,3000};
    static int totalStudents =1;



    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentID;
    String studentAddress;
    double studentFeeBalance;
        * */


        student2.enrollStudent("tami", "Ny", "QA");
 /*
        *
    static int totalStudents =2;
    String studentName = "tami";
    String studentEnrolledCourse= qa;
    int studentID = 2 ;
    String studentAddress = "Ny";
    double studentFeeBalance = 3000;
        * */


    student1.displayStudentProfile();


    Students student3 = new Students();

    student3.enrollStudent("fun", "FL", "web");

    student3.displayStudentProfile();
    student2.displayStudentProfile();




    }
}
