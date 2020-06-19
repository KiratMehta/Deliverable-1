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
    public enum Suit {hearts,diamonds};//predefined set of constants, userdefined data type
    public enum Suit1 {clubs,spades};
    public enum Value
    {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING    
    };
    private Suit s;    
    private Suit1 s1;    
    private Value val;
    public Cards(Suit s,Value v)
    {
        setS(s);
        setVal(v);
    }public Cards(Suit1 s1,Value v)
    {
        setS1(s1);
        setVal(v);
    }
    
    public Suit getS() {
        return s;
    }

    public void setS(Suit s) {
        this.s = s;
    }
    public Suit1 getS1() {
        return s1;
    }

    public void setS1(Suit1 s1) {
        this.s1 = s1;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
    
}
