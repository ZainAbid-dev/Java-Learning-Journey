package ATMMachine;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("-----Simple ATM Machine----");
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        boolean condition = true;
        while (condition) {
            System.out.println("1. Check balance");
            System.out.println("2. Cash deposit");
            System.out.println("3. Cash withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter the choice 1-4:  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is :  " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount:  ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount <= 0) {
                        System.out.println("You can't deposit in negative ");
                    } else {
                        balance += depositAmount;
                        System.out.println("Your amount is successfully deposited");
                        System.out.println("Your new balance is :  " + balance);

                    }
                    break;
                case 3:
                    System.out.print("Enter the amount :  ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount <= 0) {
                        System.out.println("You can't withdraw in negative");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance  ");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdraw the amount");
                        System.out.println("Your new balance is :  " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using our services");
                    condition = false;
                    break;
                default:
                    System.out.println("You have press the invalid button");
                    break;
            }

        }
    }
}

