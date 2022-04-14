package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Enter player names!");
        System.out.println("Player 1:");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        System.out.println("Player 2:");
        String name2= input.nextLine();
        int score1 = 0;
        int score2 = 0;

        boolean cont = true;
        while (cont){
            System.out.println("Score");
            System.out.println(name1 + ": "+ score1);
            System.out.println(name2 + ": "+ score2);
            String[][] gameB = {{" "," "," "},{" "," "," "},{" "," "," "}};


            int row;
            int col;
            Random rand = new Random();
            int turn = rand.nextInt(2);

            int xo = 0;

            boolean win = false;
            boolean valid = false;
            while (!win) {
                //Print board
                for (int i = 0; i < gameB.length; i++) {
                    for (int j = 0; j < gameB[i].length; j++) {
                        System.out.print(gameB[i][j]);
                        if (j < 2) {
                            System.out.print(" | ");
                        }
                    }
                    System.out.println();
                    if (i < 2) {
                        System.out.println("---------");
                    }
                }

                //Checks Valid input and repeats until player succeeds
                while (!valid) {
                    //Player 1 turn
                    if (turn == 0) {
                        System.out.println(name1 + ", your turn! Select row(0-2):");
                        row = input.nextInt();
                        System.out.println("Select column(1-3):");
                        col = input.nextInt();
                        if (row >= 0&&row < 3&&col >= 0&&col < 3&& gameB[row][col].equals(" ")) {
                            if (xo == 0) {
                                gameB[row][col] = "x";
                                xo = 1;
                                valid = true;
                            }
                            else {
                                gameB[row][col] = "o";
                                xo = 0;
                                valid = true;
                            }
                            turn = 1;
                        } else {
                            System.out.println("You can't place there! Try again!");
                        }
                    }
                    //Player 2 turn
                    else {
                        System.out.println(name2 + ", your turn! Select row(0-2):");
                        row = input.nextInt();
                        System.out.println("Select column(0-2):");
                        col = input.nextInt();
                        if (row>=0&&row<3&&col>=0&&col<3&& gameB[row][col].equals(" ")) {
                            if (xo == 0) {
                                gameB[row][col] = "x";
                                xo = 1;
                                valid = true;
                            } else {
                                gameB[row][col] = "o";
                                xo = 0;
                                valid = true;
                            }
                            turn = 0;
                        } else {
                            System.out.println("You can't place there! Try again!");
                        }
                    }

                }
                valid = false;

                //checks row for wins
                for (String[] strings : gameB) {
                    if (!strings[0].equals(" ")) {
                        if (strings[0].equals(strings[1]) && strings[0].equals(strings[2])) {
                            win = true;
                            if (turn == 1) {
                                System.out.println(name1 + " wins!");
                                score1++;
                            } else {
                                System.out.println(name2 + " wins!");
                                score2++;
                            }
                            break;
                        }
                    }
                }
                //check columns for win
                for (int j = 0; j < gameB.length; j++) {
                    if(!gameB[0][j].equals(" ")) {
                        if (gameB[0][j].equals(gameB[1][j]) && gameB[0][j].equals(gameB[2][j])) {
                            win = true;
                            if (turn == 1) {
                                System.out.println(name1 + " wins!");
                                score1++;
                            } else {
                                System.out.println(name2 + " wins!");
                                score2++;
                            }
                            break;
                        }
                    }
                }
                //checks diagonal for wins
                if(!gameB[0][0].equals(" ")) {
                    if (gameB[0][0].equals(gameB[1][1]) && gameB[0][0].equals(gameB[2][2])) {
                        win = true;
                        if (turn == 1) {
                            System.out.println(name1 + " wins!");
                            score1++;
                        } else {
                            System.out.println(name2 + " wins!");
                            score2++;
                        }
                        break;
                    }
                }
                if(!gameB[0][2].equals(" ")) {
                    if (gameB[0][2].equals(gameB[1][1]) && gameB[0][2].equals(gameB[2][0])) {
                        win = true;
                        if (turn == 1) {
                            System.out.println(name1 + " wins!");
                            score1++;
                        } else {
                            System.out.println(name2 + " wins!");
                            score2++;
                        }
                        break;
                    }
                }


            }
            for (int i = 0; i < gameB.length; i++) {
                for (int j = 0; j < gameB[i].length; j++) {
                    System.out.print(gameB[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println("");
                if (i < 2) {
                    System.out.println("---------");
                }
            }
            System.out.println("Do you want to continue?y/n:");
            String c;
            Scanner end = new Scanner(System.in);
            c = end.nextLine();
            if(c.equals("n")){
                cont = false;
            }
        }
        System.out.println("Good games! " + name1 + " and " + name2 + "!");
    }
}
