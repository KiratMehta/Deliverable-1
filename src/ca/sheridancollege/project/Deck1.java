

/*
 * Group: Kirat Mehta, Gurjit Singh, Jagdeep Singh, Parminder Kaur Puri
 * 1205_11047 - Fundamentals of Software Design and Development
 * Project name :- Card Game
 * Date 08 August 2020
 */
package ca.sheridancollege.project;


public class Deck1 {
    //encapsulation for deck2 that contains remaining 26 cards
    public enum Suit {hearts,diamonds};//predefined set of constants, userdefined data type
    
    public enum Value
    {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING    
    };
    private Suit s;    
   
    private Value val;
    public Deck1(Suit s,Value v)
    {
        setS(s);
        setVal(v);
    }
    
    public Suit getS() {
        return s;
    }

    public void setS(Suit s) {                       //setting enum(Suit) value
        this.s = s;
    }
    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {                 //setting enum(Value) value
        this.val = val;
    }
    @Override
    public String toString(){
        return s+" "+val;
    } 

  
    
}
