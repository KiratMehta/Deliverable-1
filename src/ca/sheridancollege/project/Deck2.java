/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date July 2020
 */

package ca.sheridancollege.project;

public class Deck2{

   

      public enum Suit1 {clubs,spades};
    public enum Value1
    {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING    
    };
     private Suit1 s1;    
    private Value1 val;
    public Deck2(Suit1 s1,Value1 v1)
    {
        setS1(s1);
        setVal(v1);
    }

    /**
     * @return the s1
     */
    public Suit1 getS1() {
        return s1;
    }

    /**
     * @param s1 the s1 to set
     */
    public void setS1(Suit1 s1) {
        this.s1 = s1;
    }

    /**
     * @return the val
     */
    public Value1 getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(Value1 val) {
        this.val = val;
    }
    
    public String toString(){
        return s1+" "+val;
    } 
}
