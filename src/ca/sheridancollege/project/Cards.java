/*
 * Gurjit Singh
 * Student ID: 991592634
 */
package ca.sheridancollege.project;

/**
 *
 * @author Gurjit
 */
public class Cards {
    //public enum Directions{East,west,north,south};
    public enum Suit {hearts,diamonds,clubs,spades};//predefined set of constants, userdefined data type
    public enum Value
    {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING,joker    
    };
    private Suit s;    
    private Value val;
    public Cards(Suit s,Value v)
    {
        setS(s);
        setVal(v);
    }
    
    public Suit getS() {
        return s;
    }

    public void setS(Suit s) {
        this.s = s;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
    
}
