/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date August 2020
 */
package ca.sheridancollege.project;

public class GenerateCard extends Generate
{
        int deck=26;
        Deck1 generate[] = new Deck1[deck];   //26 cards
        @Override
    public void generateCard()
    {
        int counter=0;
        for( Deck1.Suit s: Deck1.Suit.values())//enhanced for loop - index value not needed
        {
            for(Deck1.Value v: Deck1.Value.values())
            {
                generate[counter] = new Deck1(s,v); //object address is stored in arrsay
                counter++;
            }
        }
    }
    Deck2 generate2[]=new Deck2[deck];
        @Override
     public void generateCard1()
    {
        
        int counter=0;
        for( Deck2.Suit1 s1: Deck2.Suit1.values())//enhanced for loop - index value not needed
        {
            for(Deck2.Value1 v1: Deck2.Value1.values())
            {
                generate2[counter] = new Deck2(s1,v1); //object address is stored in arrsay
                counter++;
            }
        }
    }

  
   
}
