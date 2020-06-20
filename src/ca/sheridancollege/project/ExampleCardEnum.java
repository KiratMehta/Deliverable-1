
package ca.sheridancollege.project;

import java.util.Scanner;


public class ExampleCardEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char check;
        int ran = 0;
        int ran2 = 0;

        int player1Score = 0;
        int player2Score = 0;

        
        GenerateCard ch = new GenerateCard();
        ch.generateCard();
        
     

       
        GenerateCard ch2 = new GenerateCard();
        ch2.generateCard1();
        

        do {

            System.out.println("Two players have been given equal amount of cards ");
            System.out.println();

            System.out.println("If Player 1 wants to register and play press 1 ");
            int play = scan.nextInt();

            if (play == 1) {
                ran = (int) (Math.random() * 26);
                System.out.println("PLAYER 1 cards: " + ch.generate[ran]);
                System.out.println(ran);
            }
            else{
                System.out.println("Player 1 doesn't want to continue, The game has ended");
                break;
            }
            System.out.println("If Player 2 wants to register and play press 1 ");
           
            int play2 = scan.nextInt();

            if (play2 == 1) {
                ran2 = (int) (Math.random() * 26);
               
                System.out.println("PLAYER 2 cards: " + ch2.generate2[ran2]);
                Card2 x=ch2.generate2[ran2];
                System.out.println(x);

            }
            else{
                System.out.println("If Player 1 doesn't want to continue, The game has ended");
                break;
            }

            if (ran > ran2) {
                System.out.println("PLAYER 1 won");
                player1Score = player1Score + 1;
            } 
            else if(ran==ran2){
                System.out.println("Draw");
            }
            else {
                System.out.println("PLAYER 2 won");
                player2Score = player2Score + 1;
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
