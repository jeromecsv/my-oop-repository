package Week2.BankSystem;

import java.util.Random;

public class CheckingAccount extends Account{

    public CheckingAccount(String name){

        super(name);
        this.setName(name);
        this.setAcctNumber(String.format("%06d",accountNumber));
        this.setBalance(100);
        this.setAcctType("Checking Account");

        this.setMinimumBalance(100);
        this.setPenalty(10);
        this.setInterestCharge(0);
        this.setTransactionCharge(1);
    }

    Random accountRandom = new Random();
    int accountNumber = accountRandom.nextInt(99999999);
    public void displayAccountInfo(){
        System.out.println("==============================");
        System.out.println("Account Name: "+this.getName());
        System.out.println("Account Number: "+this.getAcctNumber());
        System.out.println("Account Balance: "+this.getBalance());
        System.out.println("Account Type: "+this.getAcctType());
        System.out.println("Minimum Balance: "+this.getMinimumBalance());
        System.out.println("Penalty: "+this.getPenalty());
        System.out.println("Interest Charge : "+ this.getInterestCharge());
        System.out.println("Transaction Charge: "+this.getTransactionCharge());
    }
}
