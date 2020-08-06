/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author ASUS
 */
public class Register {
    
    private String player1Name,player2Name;
    private int player1ID,player2ID;

    /**
     * @return the player1Name
     */
    public String getPlayer1Name() {
        return player1Name;
    }

    /**
     * @param player1Name the player1Name to set
     */
    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    /**
     * @return the player2Name
     */
    public String getPlayer2Name() {
        return player2Name;
    }

    /**
     * @param player2Name the player2Name to set
     */
    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    /**
     * @return the player1ID
     */
    public int getPlayer1ID() {
         player1ID=(int) (Math.random() * 1000000);
        return player1ID;
    }

    /**
     * @param player1ID the player1ID to set
     */
    public void setPlayer1ID(int player1ID) {
        
       
        this.player1ID = player1ID;
    }

    /**
     * @return the player2ID
     */
    public int getPlayer2ID() {
       player2ID=(int) (Math.random() * 1000000);
        return player2ID;
    }

    /**
     * @param player2ID the player2ID to set
     */
    public void setPlayer2ID(int player2ID) {
       
         
        this.player2ID = player2ID;
    }
    
     
    public String Instructions(){
        
        return "----INSTRUCTIONS----\n"+"Two players are allowed to play the game.\n"+
                "The player with the greatest card wins\n"+"Players will pick a random card from their deck\n";
        
        
    }
    
    
}
