package Week2.BankSystem;

public class DisplayInfo {

    Account account;
    public DisplayInfo(Account account){
        this.account = account;
    }

    public DisplayInfo() {

    }

    public void displayReg(){

        System.out.println("Account Name: " + this.account.getName());
        System.out.println("Account Number: " + this.account.getAcctNumber());
        System.out.println("Account Balance: " + this.account.getBalance());
        System.out.println("Account Type: " + this.account.getAcctType());
        System.out.println("Minimum Balance: " + this.account.getMinimumBalance());
        System.out.println("Penalty: " + this.account.getPenalty());
    }
    public void displayInt(){
        System.out.println("Account Name: " + this.account.getName());
        System.out.println("Account Number: " + this.account.getAcctNumber());
        System.out.println("Account Balance: " + this.account.getBalance());
        System.out.println("Account Type: " + this.account.getAcctType());
        System.out.println("Interest Charge: " + this.account.getInterestCharge());
    }
    public void displayChecking(){
        System.out.println("Account Name: " + this.account.getName());
        System.out.println("Account Number: " + this.account.getAcctNumber());
        System.out.println("Account Balance: " + this.account.getBalance());
        System.out.println("Account Type: " + this.account.getAcctType());
        System.out.println("Minimum Balance: "+this.account.getMinimumBalance());
        System.out.println("Penalty: "+this.account.getPenalty());
        System.out.println("Interest Charge : "+ this.account.getInterestCharge());
        System.out.println("Transaction: "+this.account.getTransactionCharge());
    }
}
