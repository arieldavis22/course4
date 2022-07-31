package ConstructorChallenge;

public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("Bob", 9999);
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("Bill", 100, "email@haha.com");
        System.out.println(person3.getName());

    }
}
