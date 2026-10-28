package Loop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("-----Number Guessing Game-----");


        Random random = new Random();
        int randomNumber = random.nextInt(100) +1;

        int count = 1;
        boolean isWon = false;

        Scanner sc = new Scanner(System.in);


        System.out.println("You have only 5 attempts");

        while (count <= 5) {
            System.out.print("Please, enter the number between 1 and 100:  ");
            int num = sc.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("Invalid Number!Your number must be between 1 and 100");
                continue;
            }

            if (num > randomNumber) {
                System.out.println("Too High! Try again");
            } else if (num < randomNumber) {
                System.out.println("Too Low! Try again");

            } else {
                isWon = true;
                break;

            }
            System.out.println("Attempts remaining  " + (5 - count));
            count++;
        }

        if(isWon){
            System.out.println("Congratulations! Your number is correct ");
            System.out.println("You won in  " + count + " attempt!");
        } else {
            System.out.println("You lost this game and your number is :  " + randomNumber);
        }

    }
}
