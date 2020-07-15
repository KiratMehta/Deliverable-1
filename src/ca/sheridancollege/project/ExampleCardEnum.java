
/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date July 2020
 */
package ca.sheridancollege.project;

import java.util.Scanner;

public class ExampleCardEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char check;               // intitalization of check
        int ran = 0;              // declare ran 0
        int ran2 = 0;             // declare ran2 0

        int player1Score = 0;
        int player2Score = 0;

        GenerateCard ch = new GenerateCard();
        ch.generateCard();

        GenerateCard ch2 = new GenerateCard();
        ch2.generateCard1();

        do {
            System.out.println("----INSTRUCTIONS----");
            System.out.println("Two players have been given equal amount of cards ");
            System.out.println("The player with the greatest card wins");
            System.out.println("Players will pick a random card from their deck");
            
            System.out.println();

            System.out.println("If Player 1 wants to register and play press 1 ");
            int play = scan.nextInt();

            if (play == 1) {
                ran = (int) (Math.random() * 26);
                System.out.println("PLAYER 1 cards: " + ch.generate[ran]);

            } else {
                System.out.println("Player 1 doesn't want to continue, The game has ended");
                break;
            }
            System.out.println("If Player 2 wants to register and play press 1 ");

            int play2 = scan.nextInt();

            if (play2 == 1) {
                ran2 = (int) (Math.random() * 26);

                System.out.println("PLAYER 2 cards: " + ch2.generate2[ran2]);

            } else {
                System.out.println("If Player 1 doesn't want to continue, The game has ended");
                break;
            }

            if (ran < 13 && ran2 < 13 || ran >= 13 && ran2 >= 13) {
                if (ran > ran2) {

                    System.out.println("PLAYER 1 won");
                    player1Score = player1Score + 1;
                } else if (ran == ran2) {

                    System.out.println("Draw");
                } else {

                    System.out.println("PLAYER 2 won");
                    player2Score = player2Score + 1;
                }
            } else if (ran < 13 && ran2 >= 13 || ran >= 13 && ran2 < 13) {
                if (ran2 > ran) {
                    ran2 = ran2 - 13;
                } else {
                    ran = ran - 13;
                }
                if (ran > ran2) {

                    System.out.println("PLAYER 1 won");
                    player1Score = player1Score + 1;
                } else if (ran == ran2) {

                    System.out.println("Draw");
                } else {

                    System.out.println("PLAYER 2 won");
                    player2Score = player2Score + 1;
                }
            }
            System.out.println("Do you want to contniue: (if yes press y)");
            check = scan.next().charAt(0);
            System.out.println();
        } while (check == 'y' || check == 'Y');

        System.out.println("PLAYER 1 score: " + player1Score);

        System.out.println();

        System.out.println("PLAYER 2 score: " + player2Score);

        System.out.println();

        System.out.println("Final score---> ");
        if (player1Score > player2Score) {
            System.out.println("PLAYER 1 won");
        } else if (player2Score == player1Score) {
            System.out.println("DRAW");
        } else {
            System.out.println("PLAYER 2 won");
        }

    }

}
