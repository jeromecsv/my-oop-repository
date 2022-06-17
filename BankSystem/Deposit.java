package Week2.BankSystem;

import java.util.Scanner;

public class Deposit {
    private double x;
    public Deposit(Account account, Double x){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Amount to Deposit: ");
        double inputDeposit = scan.nextDouble();

        if (account.getAcctType() == "Checking Account"){
            account.setBalance(account.getBalance() + inputDeposit - 1);
        }
        else {
            account.setBalance(account.getBalance() + inputDeposit);
        }
        this.x = inputDeposit;

    }

}
