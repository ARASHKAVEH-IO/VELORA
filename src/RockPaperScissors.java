import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        int userChoice, computerChoice, rock, paper, scissors;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        rock = 0;
        paper = 1;
        scissors = 2;

        System.out.println("ROCK - PAPER - SCISSORS GAME");

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("\nENTER YOUR CHOICE (ROCK = 0, PAPER = 1, SCISSORS = 2): ");
            userChoice = input.nextInt();
            while (userChoice > 2 || userChoice < 0) {
                System.out.println("GIVE NUMBERS BETWEEN 0 AND 2: ");
                userChoice = input.nextInt();
            }

            if (userChoice == rock) {
                System.out.println("USER CHOSE ROCK");
            } else if (userChoice == paper) {
                System.out.println("USER CHOSE PAPER");
            } else {
                System.out.println("USER CHOSE SCISSORS");
            }

            computerChoice = rnd.nextInt(3);
            if (computerChoice == rock) {
                System.out.println("COMPUTER CHOSE ROCK");
            } else if (computerChoice == paper) {
                System.out.println("COMPUTER CHOSE PAPER");
            } else {
                System.out.println("COMPUTER CHOSE SCISSORS");
            }

            while (userChoice == computerChoice) {
                System.out.println("DRAW , TRY AGAIN.");

                System.out.println("\nENTER YOUR CHOICE (ROCK = 0, PAPER = 1, SCISSORS = 2): ");
                userChoice = input.nextInt();
                while (userChoice > 2 || userChoice < 0) {
                    System.out.println("GIVE NUMBERS BETWEEN 0 AND 2: ");
                    userChoice = input.nextInt();
                }

                if (userChoice == rock) {
                    System.out.println("USER CHOSE ROCK");
                } else if (userChoice == paper) {
                    System.out.println("USER CHOSE PAPER");
                } else {
                    System.out.println("USER CHOSE SCISSORS");
                }

                computerChoice = rnd.nextInt(3);
                if (computerChoice == rock) {
                    System.out.println("COMPUTER CHOSE ROCK");
                } else if (computerChoice == paper) {
                    System.out.println("COMPUTER CHOSE PAPER");
                } else {
                    System.out.println("COMPUTER CHOSE SCISSORS");
                }
            }

            if (computerChoice == rock) {
                if (userChoice == paper) {
                    System.out.println("USER WINS!");
                } else {
                    System.out.println("COMPUTER WINS!");
                }
            } else if (computerChoice == paper) {
                if (userChoice == rock) {
                    System.out.println("COMPUTER WINS!");
                } else {
                    System.out.println("USER WINS!");
                }
            } else if (userChoice == rock) {
                System.out.println("USER WINS!");
            } else {
                System.out.println("COMPUTER WINS!");
            }

            System.out.print("\nWANT TO PLAY AGAIN? (y/n): ");
            char again = input.next().charAt(0);
            if (again != 'y' && again != 'Y') {
                playAgain = false;
                System.out.println("THANK YOU FOR PLAYING NOW GET OUT OF MY SIGHT!");
            }
        }

        input.close();
    }
}
