package Week2.BankSystem;

import java.util.Random;

public class InterestAccount extends Account{

    public InterestAccount(String name){
        super(name);
        this.setName(name);
        this.setAcctNumber(String.format("%06d",accountNumber));
        this.setBalance(0);
        this.setAcctType("Interest Account");
        this.setInterestCharge(3);
    }
    Random accountRandom = new Random();
    int accountNumber = accountRandom.nextInt(99999999);
    public void displayAccountInfo(){

        System.out.println("==============================");
        System.out.println("Account Name: "+this.getName());
        System.out.println("Account Number: "+this.getAcctNumber());
        System.out.println("Account Balance: "+this.getBalance());
        System.out.println("Account Type: "+this.getAcctType());
        System.out.println("Interest Charge : "+ this.getInterestCharge());
    }

}
