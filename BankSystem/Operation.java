package Week2.BankSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Operation{

    Account account;
    public Operation(Account account){
        this.account = account;
    }
    public Operation(){
    }
    public void selectTransaction() {

        ArrayList<Transaction> transactionArray = new ArrayList<Transaction>();  //Instantiate ArrayList of Transaction class to create transactionArray object

        int input;

        do {     // repetition of selection of operation to be perform
            Scanner scan = new Scanner(System.in);
            System.out.println("\n======================");
            System.out.println("Choose an Operation to Perform\n[1] Deposit\n[2] Withdraw\n[3] Display Account Info\n[4] Display Transaction\n[-1] exit");
            System.out.print("Enter Transaction type: ");
            input = scan.nextInt();

            double amount = 0.0;
            switch (input) {
                case 1:  // Select DEPOSIT TRANSACTION
                    System.out.print("Enter Amount to Deposit: ");
                    double inputDeposit = scan.nextDouble();

                    if (this.account.getAcctType() == "Checking Account") {
                        this.account.setBalance(this.account.getBalance() + inputDeposit - 1);      // checking account transaction always deduct 1 for transaction fee
                    } else {
                        this.account.setBalance(this.account.getBalance() + inputDeposit);  // just add the deposit account to current balance if not checking account
                    }
                    amount = this.account.getBalance();
                    transactionArray.add(new Transaction(LocalDateTime.now(), "DEP", inputDeposit, amount));  // populate transactionArraylist object
                    System.out.println("Current Balance: " + this.account.getBalance());
                    break;
                case 2:   // Select WITHDRAW TRANSACTION

                    System.out.print("Enter Amount to Withdraw: ");
                    double inputWithdraw = scan.nextDouble();

                    if (this.account.getAcctType() == "Regular Account") {                       // Identify what type of account this case is regular account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                        if (this.account.getBalance() < 500) {
                            this.account.setBalance(this.account.getBalance() - 10);            // when the current balance is less than 500, every withdrawal will deduct additional 10
                        }

                    } else if (this.account.getAcctType() == "Interest Account") {              // Identify what type of account this case is interest account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                    } else if (this.account.getAcctType() == "Checking Account") {              // Identify what type of account this case is regular account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                        if (this.account.getBalance() < 100) {
                            this.account.setBalance(this.account.getBalance() - 11);            // when the current balance is less than 100, every withdraw transaction will deduct additional 10 for penalty and 1 for transaction fee

                        } else {
                            this.account.setBalance(this.account.getBalance() - 1);              // when the current balance is above 100, only 1 will deduct for transaction fee
                        }
                    }

                    amount = this.account.getBalance();                                           // the value of the current balance will be pass to amount variable
                    transactionArray.add(new Transaction(LocalDateTime.now(), "WDR", inputWithdraw, amount));   // new transaction object will add to transaction array list
                    System.out.println("Current Balance: " + amount);                               // will print out the current balance
                    break;
                case 3:   // Select DISPLAY INFO TRANSACTION

                    AccountTypeChecker checker = new AccountTypeChecker(account); // Instantiate  AccountTypeChecker to call the condition method from the class
//                if (this.account.getAcctType() == "Regular Account") {
//                    System.out.println("Regular");
//
//                } else if (this.account.getAcctType() == "Interest Account") {
//                    System.out.println("Interest");
//
//                } else if (this.account.getAcctType() == "Checking Account"){
//                    System.out.println("Checking");
//                }
                    break;
                case 4:
                    System.out.println("==========================================================================================");
                    System.out.println("Transaction Date                         Type           Amount          Running Balance");
                    for (Transaction transaction : transactionArray) {      // extract amount array content.
                        System.out.println(transaction.getTimeStamp() + "             " + transaction.getType() + "           " + transaction.getAmount() + "             " + transaction.getRunningBalance());
                    }
                    System.out.println("==========================================================================================");
                    break;
                    default :
            }
        }
        while (input != -1); // termination of loop for the selection of operation to be perform
    }
    public void accountCreation(){
        Scanner scan = new Scanner(System.in);          // Scanner Input for Account Type
        int input;

        System.out.println("Choose an account type to open\n[1] Regular Account\n[2] Interest Account\n[3] Checking Account\n[-1] exit");
        System.out.print("Enter account type: ");
        input = scan.nextInt();

        Scanner accountName = new Scanner(System.in);    // Scanner Input for Account Name
        String name;
        switch (input)  {
            case 1 :System.out.print("Enter Account Name: ");
                    name = accountName.nextLine();
                    RegularAccount regularAccount = new RegularAccount(name);       // Instantiate RegularAccount class to make regular account object
                    regularAccount.displayAccountInfo();                            // Call displayAccountInfo method from RegularAccount Class
                    Operation regOperation = new Operation(regularAccount);            // Instantiate Operation Class to create new operation object which have return type "name" from regular account
                    regOperation.selectTransaction();
                    break;
            case 2 :System.out.print("Enter Account Name: ");
                    name = accountName.nextLine();
                    InterestAccount interestAccount = new InterestAccount(name);
                    interestAccount.displayAccountInfo();
                    Operation intOperation = new Operation(interestAccount);
                    intOperation.selectTransaction();
                    break;
            case 3 :System.out.print("Enter Account Name: ");
                    name = accountName.nextLine();
                    CheckingAccount checkingAccount = new CheckingAccount(name);
                    checkingAccount.displayAccountInfo();
                    Operation checkOperation = new Operation(checkingAccount);
                    checkOperation.selectTransaction();
                    break;

            case -1 :System.out.println("Good Bye!");
                break;
            default :System.out.println("invalid input!");
        }
    }
}
