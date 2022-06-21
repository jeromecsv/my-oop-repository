package Week2.BDO;

public class RegularAccount extends Account{

    private double minimumBalance;
    private double penalty;
    private String acctType;
    private double balance;

    @Override
    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double getPenalty() {
        return penalty;
    }

    @Override
    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public RegularAccount() {
        this.balance = 500;
        this.acctType = "Regular";
        this.minimumBalance = 500;
        this.penalty = 10;

    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: "  +getBalance());
        System.out.println("Account Type: "  +getAcctType());
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Penalty: " + getPenalty());
    }
}
