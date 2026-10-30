package Loop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("-----Number Guessing Game-----");


        System.out.println("Yuu have only 5 attempts");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;


        boolean isWon = false;

        int j = 1;
        while(j < 5) {
            int count = 1;
            while (count < 5) {
                System.out.print("Enter the number between 1 and 100:  ");
                int number = sc.nextInt();

                if (number < 1 || number > 100) {
                    System.out.println("Enter the number between 1 and 100");
                    continue;
                }
                if (number > randomNumber) {
                    System.out.println("Too High! Try again");
                } else if (number < randomNumber) {
                    System.out.println("Too Low! Try again");
                } else {
                    isWon = true;
                    break;
                }
                System.out.println("Remaining attempts :  " + (5 - count));
                count++;
            }
            if (isWon) {
                System.out.println("Congratulations! You won");
            } else {
                System.out.println("You lost this game. Your number was :  " + randomNumber);
            }

            System.out.print("Do you want to play again:  ");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("yes") ){
                System.out.println("OK. You are ready to play.");
                randomNumber = random.nextInt(10) + 1;
                isWon = false;
            } else if(choice.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing");
                break;
            }
            j++;
        }
    }
}
