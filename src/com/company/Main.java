package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	    Create a Rock-Paper-Scissors game that allows 2 people to play against each other.
	    Requirements:
	    - use Scanner to get user input
	    - use control-flow statements to determine the winner and print it out
	    - allow players to repeatedly play many games
	    - must make use of at least one class
	    Stretch Goals:
	    - allow players to enter their name for a more personalized experience
	    - keep track of score
	    - Extend your game to be tic-tac-toe instead of Rock-Paper-Scissors
	 */
        boolean cont = true;
        while (cont) {
            System.out.println("ROCK PAPER SCISSOR! or do you want to QUIT? (Type QUIT to end): ");
            Scanner player1 = new Scanner(System.in);
            String choice = player1.nextLine();
            Random rand = new Random();
            int rand_int1 = rand.nextInt(3);
            switch(choice) {
                case "ROCK", "Rock", "rock":
                    if (rand_int1 == 0) {
                        System.out.println("ROCK! Looks like we tied!");
                        break;
                    }
                    if (rand_int1 == 1) {
                        System.out.println("Paper! Looks like I win!");
                        break;
                    }
                    if (rand_int1 == 2) {
                        System.out.println("Scissor! Looks like I Lost!");
                        break;
                    }
                case "PAPER", "Paper", "paper":
                    if (rand_int1 == 0) {
                        System.out.println("ROCK! Looks like I lost!");
                        break;
                    }
                    if (rand_int1 == 1) {
                        System.out.println("Paper! Looks like we tied!");
                        break;
                    }
                    if (rand_int1 == 2) {
                        System.out.println("Scissor! Looks like I win!");
                        break;
                    }

                case "SCISSOR", "Scissor", "scissor":
                    if (rand_int1 == 0) {
                        System.out.println("ROCK! Looks like I win!");
                        break;
                    }
                    if (rand_int1 == 1) {
                        System.out.println("Paper! Looks like I Lost!");
                        break;
                    }
                    if (rand_int1 == 2) {
                        System.out.println("Scissor! Looks like we tie!");
                        break;
                    }
                case "QUIT":
                    System.out.println("See you next time, challenger!");
                    cont = false;
                    break;
                default:
                    System.out.println("Hey! That isn't a choice!");

            }
        }
    }
}
