package Week2.BDO;

import java.util.Scanner;

public class Operation {

    StringBlocks operation = new StringBlocks();
    Account displayInfo = new RegularAccount();

    public void performOperation(){
        operation.operationSelection();
        Scanner ops = new Scanner(System.in);
        String selectedOperation;
        System.out.println("Enter transaction type:");
        selectedOperation = ops.next();
        switch (selectedOperation){
            case "1":
                System.out.println("You must Deposit");
                break;
            case "2":
                System.out.println("You must Withdraw");
                break;
            case "3":
                System.out.println("You must Display Account");
                displayInfo.displayAccountInfo();
                break;
            case "4":
                System.out.println("You must Display Transaction");
                break;
                default :
                    System.out.println("invalid input");
        }
    }
    public void accountCreation(){
        StringBlocks selectedAccountType = new StringBlocks();
        Account account = new RegularAccount();
        selectedAccountType.createAccountSelection();
        Scanner type = new Scanner(System.in);
        System.out.print("Enter account type: ");
        String acctType = type.next();
        Scanner name = new Scanner(System.in);
        String acctName;
        switch (acctType){
            case "1":
                System.out.print("Enter Account Name: ");
                acctName = type.next();
                account.setName(acctName);
                account.displayAccountInfo();
                performOperation();
                break;
        }
    }
}
