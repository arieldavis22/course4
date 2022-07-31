package ClassChallenge;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1, 200, "Ariel", "email@email.com", "999-999-9999");
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());
        myAccount.deposit(100);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(900);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(200);
        System.out.println(myAccount.getBalance());
    }
}
