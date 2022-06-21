package Week2.BDO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account display = new RegularAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String myName = scanner.nextLine();
        display.setName(myName);
        display.displayAccountInfo();
    }
}
