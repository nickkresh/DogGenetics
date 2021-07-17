package com.company;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int ties = 0;
        int loses = 0;
        int wins = 0;

        Scanner myObj = new Scanner (System.in);
        System.out.println("How many rounds would you like to play?");
        int rounds = myObj.nextInt();
        if(rounds > 10 || rounds < 1) {
            System.out.println("Error");
            System.exit(101);
        }

        for (int i = 0; i < rounds; i++) {
            System.out.println("Chose paper, rock, or scissors");
            System.out.println("1=Rock, 2=Paper, 3=Scissors");
            System.out.println("1,2,3");
            Random random = new Random();
            // A number between 1 and 3
            int max = 3;
            int min = 1;

            int computerChoice = random.nextInt(max - min + 1) + min;

            int choice = myObj.nextInt();

            switch (choice) {
                // rock
                case 1:
                    if (computerChoice == 1) {
                        System.out.println("tie");
                        ties++;
                    }

                    if (computerChoice == 2) {
                        System.out.println("lose");
                        loses++;
                    }

                    if (computerChoice == 3) {
                        System.out.println("win");
                        wins++;
                    }
                    break;
                // paper
                case 2:
                    if (computerChoice == 1) {
                        System.out.println("win");
                        wins++;
                    }

                    if (computerChoice == 2) {
                        System.out.println("tie");
                        ties++;
                    }

                    if (computerChoice == 3) {
                        System.out.println("lose");
                        loses++;
                    }
                    break;
                // sc
                case 3:
                    if (computerChoice == 1) {
                        System.out.println("lose");
                        loses++;
                    }

                    if (computerChoice == 2) {
                        System.out.println("win");
                        wins++;
                    }

                    if (computerChoice == 3) {
                        System.out.println("tie");
                        ties++;
                    }
                    break;
            }
        }

        System.out.println("Score:");
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Ties: " + ties);

        if (wins > loses) {
            System.out.println("You won");
        } else {
            if (ties == rounds || wins == loses) {
                System.out.println("You tied");
            } else {
                System.out.println("You lost");
            }
        }

        System.out.println("Thanks for playing, would you like to play again?");
        System.out.println("Yes/No");
        String choice = myObj.next();
        if (choice.equalsIgnoreCase("Yes")) {
            // start over
            startGame();
        } else if (choice.equalsIgnoreCase("No")) {
            // exit
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            // error
            System.out.println("Error");
            System.exit(101);
        }
    }
}
