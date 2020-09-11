import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {


//     ITERATION #1 - When the user guesses 7, the game announces they have won. All other numbers lose.
        System.out.println("Hello, Welcome to the number guessing game!");
        System.out.println("Please guess a number!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == 7){
            System.out.println("Congratulations! You win!!! (Sorry, out of prizes)");
        }
        else{
            System.out.println("Ooh, sorry. You lose.");
        }


//        ITERATION #2 - When the user guesses 0, the game provides instructions for the user.
        System.out.println("Hello, Welcome to the number guessing game!");
        System.out.println("Please guess a number between 1 and 10!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == 7){
            System.out.println("Congratulations! You win!!! (Sorry, out of prizes)");
        }
        else if (guess == 0){
            System.out.println("I hope you have better luck then reading skills, please guess a number BETWEEN 1 and 10, INCLUSIVE.");
        }
        else{
            System.out.println("Ooh, sorry. You lose.");
        } */


//        ITERATION #3 - After guessing, the user can take _one more_ guess (unless they won!)
        System.out.println("Hello, Welcome to the number guessing game!");
        System.out.println("Please guess a number between 1 and 10!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == 7) {
            System.out.println("Congratulations! You win!!! (Sorry, out of prizes)");
        }
        else if (guess == 0) {
            System.out.println("I hope you have better luck then reading skills, please guess a number BETWEEN 1 and 10, INCLUSIVE.");
            int guess2 = input.nextInt();
            if (guess2 == 7) {
                System.out.println("Congratulations! You win!!! (Sorry, out of prizes)");}
            else {
                System.out.println("Sorry, you are a loser.");
                }
        }

         else if ((guess != 0) && (guess != 7)) {
            System.out.println("Ooh, sorry. That's not what I am looking for.");
            System.out.println("Give it one more try");
            int guess2 = input.nextInt();
            if (guess2 == 7) {
                System.out.println("Congratulations! You win!!! (Sorry, out of prizes)");
            } else {
                System.out.println("That's not it either, you lose. Goodbye.");
            }
        }

    }
}
