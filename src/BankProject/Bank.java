package BankProject;

public class Bank {
    public static void main(String[] args) {

        Customer custOne = new Customer();

        custOne.createCustomerProfile("Happy", "NY", "123456789", " 2323232323");
        String newAddress= "Mi";
        custOne.updateAddress(newAddress);
        System.out.println(custOne.getAddres().equalsIgnoreCase(newAddress));


        // verify a customer can change address


        System.out.println("my balance:"+ custOne.getBalance()); //0
        custOne.makeDeposit(100);

        System.out.println("Balance after deposit ->"+ custOne.makeDeposit(100));
        System.out.println("Balance after deposit ->"+ custOne.makeDeposit(-10));


        System.out.println("Balance after Withdraw ->" + custOne.makeWithdraw(-700));
        System.out.println("Balance after Withdraw ->" + custOne.makeWithdraw(700));
        System.out.println("Balance after Withdraw ->" + custOne.makeWithdraw(60));

        System.out.println("My final Balance: "+ custOne.getBalance());   //40




    }
}
