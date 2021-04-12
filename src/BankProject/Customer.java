package BankProject;

public class Customer {
//field variable
    String name = "user";
    String address = "unknown";
    String phoneNumber;
    String ssn= "invalid";

    //variable to customer balance

    double balance = 0.0;
    static int customerCount= 0 ;
    static String bankName= "ABC";


    //method to return customer name

    public String getName (){

        return name;
    }

    public String getAddres (){

        return address;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public String getSSN (){

        return ssn;
    }


    public void getProfile(){

        System.out.println("Name:"+name + "\nAddress:"+ address+ "\nPhone number:"+ phoneNumber+ "\nlast 4 digits of ssn:"+ ssn + "\n Account balance:"+ balance);

    }

    // method to create customer profile

    public void createCustomerProfile (String cName, String cAddress, String cPhone, String cSSN){

        name = cName;
        address= cAddress;
        phoneNumber= cPhone;
        ssn=cSSN;

    }


    public void updateAddress (String newAddress){
        address= newAddress;


    }
// method to make deposit
    // name : MakeDeposit
    //input : 1 double
    //return type : double

    public double makeDeposit (double depositAmt) {

        if (depositAmt>0){

            balance=balance+depositAmt;}
        else{

            System.out.println("Invalid deposit amount entered-->"+ depositAmt);
        }



        return balance;
    }

    // method to make withdraw
    // name : makeWithdraw
    //input : 1 double
    //return type : double

    public double makeWithdraw (double withdrawAmt) {

        if (withdrawAmt <=balance && withdrawAmt >0){

        balance=balance-withdrawAmt;}
        else{

        System.out.println("invalid withdraw amount entered -->"+ withdrawAmt);
    }

        return balance;
    }

    //get balance to customer

    public double getBalance (){


        return balance;
    }








}
