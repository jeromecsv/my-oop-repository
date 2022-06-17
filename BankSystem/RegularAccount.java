package Week2.BankSystem;
import java.util.Random;
public class RegularAccount extends Account{

    Account account;
    public RegularAccount(String name){
        super(name);
        this.setName(name);
    this.setAcctNumber(String.format("%06d",accountNumber));
    this.setBalance(500.0);
    this.setAcctType("Regular Account");
    this.setMinimumBalance(500.0);
    this.setPenalty(10.0);
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
    }
}
