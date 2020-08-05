/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date July 2020
 */
package ca.sheridancollege.project;

public class GenerateCard extends Generate
{
        int deck=26;
        Cards generate[] = new Cards[deck];   //26 cards
        @Override
    public void generateCard()
    {
        int counter=0;
        for( Cards.Suit s: Cards.Suit.values())//enhanced for loop - index value not needed
        {
            for(Cards.Value v: Cards.Value.values())
            {
                generate[counter] = new Cards(s,v); //object address is stored in arrsay
                counter++;
            }
        }
    }
    Card2 generate2[]=new Card2[deck];
        @Override
     public void generateCard1()
    {
        
        int counter=0;
        for( Card2.Suit1 s1: Card2.Suit1.values())//enhanced for loop - index value not needed
        {
            for(Card2.Value1 v1: Card2.Value1.values())
            {
                generate2[counter] = new Card2(s1,v1); //object address is stored in arrsay
                counter++;
            }
        }
    }

        @Override
    public String Instructions(){
        
        return "----INSTRUCTIONS----\n"+"Two players are allowed to play the game.\n"+
                "The player with the greatest card wins\n"+"Players will pick a random card from their deck\n";
        
        
    }
    
}
