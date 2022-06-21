package Week2.BDO;

public class InterestAccount extends Account{
    private String acctType;
    private double balance;
    private double interestCharge;

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

    @Override
    public double getInterestCharge() {
        return interestCharge;
    }

    @Override
    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public InterestAccount() {
        this.acctType = "Interest Account";
        this.balance = 100.0;
        this.interestCharge = 3.0;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: " + getAcctType());
        System.out.println("Balance : " + getBalance());
        System.out.println("Charge: " + getInterestCharge());
    }
}
