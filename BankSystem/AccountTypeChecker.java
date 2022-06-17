package Week2.BankSystem;

public class AccountTypeChecker {

    public AccountTypeChecker(Account account){

        DisplayInfo displayInfoReg = new DisplayInfo(account);  // Instantiate Display info to create different account type object
        DisplayInfo displayInfoInt = new DisplayInfo(account);  // that will be use to the condition below:
        DisplayInfo displayInfoChecking = new DisplayInfo(account);

        if (account.getAcctType() == "Regular Account"){                //Display Regular Account Info
            displayInfoReg.displayReg();
        }
        else if (account.getAcctType() == "Interest Account") {         //Display Interest Account Info
            displayInfoInt.displayInt();
        }
        else if (account.getAcctType() == "Checking Account") {         //Display Checking Account Info
            displayInfoChecking.displayChecking();
        }

    }
}

