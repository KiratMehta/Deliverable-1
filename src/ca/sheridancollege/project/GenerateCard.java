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
        int deck=56;
        Cards generate[] = new Cards[deck];   //52 cards
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
}
