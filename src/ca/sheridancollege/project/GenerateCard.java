/*
 * Gurjit Singh
 * Student ID: 991592634
 * SYST!10199 - Web Programming
 */
package ca.sheridancollege.project;

/**
 *
 * @author Gurjit
 */
public class GenerateCard 
{
        int deck=26;
        Cards generate[] = new Cards[deck];   //26 cards
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
    
}
