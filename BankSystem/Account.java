package Week2.BankSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Account {
    private String name;
    private String acctNumber;
    private double balance;
    private double minimumBalance;
    private double penalty;
    private String acctType;
    private double interestCharge;

    private double transactionCharge;

    public Account(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = transactionCharge;
    }

    public String getName() {
        return name;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getPenalty() {
        return penalty;
    }

    public String getAcctType() {
        return acctType;
    }

    public double getInterestCharge() {
        return interestCharge;
    }

    public double getTransactionCharge() {
        return transactionCharge;
    }

    public Account(String acctNumber, String name, double balance){
        this.acctNumber = acctNumber;
        this.name = name;
        this.balance = balance;
    }
    Map<String, Account> acctList;

    public void accountTable(){
        Account a = new Account(getAcctType(), getName(), getBalance());
        acctList = new HashMap<>();
        acctList.put("TEST",a);
    }
    public List<String> accountList() {                               // Fruit list method to display
        return acctList.entrySet().stream()                     // extract the map table to manipulate
                .map(s-> s.getKey())                        // map using lambda  to get the key elements of the hash table
                .toList();                                          // collect the mapped elements and convert to list
    }
    public Account(){
    }
}
