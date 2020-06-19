/*
 * Gurjit Singh
 * Student ID: 991592634
 */
package ca.sheridancollege.project;

/**
 *
 * @author Gurjit
 */
public class ExampleCardEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        GenerateCard ch = new GenerateCard();//ch is an object to access array
        ch.generateCard();// 52 cards in the array // delegated to other class
        //print
        for(Cards s:ch.generate)
        {
            System.out.println(s.getS() +" "+ s.getVal());
        }
    }
    
}
