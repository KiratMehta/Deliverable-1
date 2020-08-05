
/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date July 2020
 */

package ca.sheridancollege.project;

import java.util.Scanner;

public class War {

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
        
        Register reg=new Register();
        
       System.out.println("Register the players\nEnter Player1 name:");
       String Pl1 = scan.nextLine();
       reg.setPlayer1Name(Pl1);

       System.out.println("Enter Player2 name:");
       String Pl2 = scan.nextLine();
       reg.setPlayer2Name(Pl2);
       
       String P1=reg.getPlayer1Name();
       String P2=reg.getPlayer2Name();
       
        System.out.println("Player 1 Name: "+P1+", Player 1 ID: "+reg.getPlayer1ID());
        System.out.println("Player 2 Name: "+P2+", Player 2 ID: "+reg.getPlayer2ID());
        
       
       System.out.println("Do you want to view INSTRUCTIONS (if yes press 1 else any other number to continue)");
            int instruct=scan.nextInt();                        
        do {            
            if(instruct==1)
            System.out.println(ch.Instructions());

            System.out.println(P1+"'s chance! To pick a card press 1 or any other number to end game");
            int play = scan.nextInt();

            if (play == 1) {
                ran = (int) (Math.random() * 26);
                System.out.println(P1 + " card: " + ch.generate[ran]);

            } else {
                System.out.println(P1+" doesn't want to continue, The game has ended");
                break;
            }
            System.out.println(P2+"'s chance! To pick a card press 1 or any other number to end game");

            int play2 = scan.nextInt(); 

            if (play2 == 1) {
                ran2 = (int) (Math.random() * 26);

                System.out.println(P2+" card: " + ch2.generate2[ran2]);

            } else {
                System.out.println(P2+" doesn't want to continue, The game has ended");
                break;
            }

            if (ran < 13 && ran2 < 13 || ran >= 13 && ran2 >= 13) {
                if (ran > ran2) {

                    System.out.println(P1+ " Won");
                    player1Score = player1Score + 1;
                } else if (ran == ran2) {

                    System.out.println("Draw");
                } else {

                    System.out.println(P2+" Won");
                    player2Score = player2Score + 1;
                }
            } else if (ran < 13 && ran2 >= 13 || ran >= 13 && ran2 < 13) {
                if (ran2 > ran) {
                    ran2 = ran2 - 13;
                } else {
                    ran = ran - 13;
                }
                if (ran > ran2) {

                    System.out.println(P1+" Won");
                    player1Score = player1Score + 1;
                } else if (ran == ran2) {

                    System.out.println("Draw");
                } else {

                    System.out.println(P2+" Won");
                    player2Score = player2Score + 1;
                }
            }
            System.out.println("Do you want to contniue: (if yes press y)");
            check = scan.next().charAt(0);
            System.out.println();
        } while (check == 'y' || check == 'Y');

        System.out.println(P1+" score: " + player1Score);

        System.out.println();

        System.out.println(P2+" score: " + player2Score);

        System.out.println();

        System.out.println("Final score---> ");
        if (player1Score > player2Score) {
            System.out.println(P1 +" Won");
        } else if (player2Score == player1Score) {
            System.out.println("DRAW");
        } else {
            System.out.println(P2+" Won");
        }

    }

}
