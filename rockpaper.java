package basic;

import java.util.*;

public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;
        int computerScore = 0;
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");
        System.out.println("Type 'exit' anytime to quit.\n");

        while (true) {
            // User input
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            // Exit condition
            if (userChoice.equals("exit")) {
                System.out.println("\nGame Over!");
                System.out.println("Final Score -> You: " + userScore + " | Computer: " + computerScore);
                if (userScore > computerScore) {
                    System.out.println("You win the match!");
                } else if (userScore < computerScore) {
                    System.out.println("Computer wins the match!");
                } else {
                    System.out.println("It's a tie overall!");
                }
                break;
            }

            // Validate input
            if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("Invalid choice! Try again.\n");
                continue;
            }

            // Computer choice
            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Decide round winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!\n");
            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win this round!\n");
                userScore++;
            } else {
                System.out.println(" You lose this round!\n");
                computerScore++;
            }

            // Show score
            System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore + "\n");
        }

        sc.close();
    }
}
