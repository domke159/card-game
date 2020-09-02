package test;

import java.util.ArrayList;

import main.java.Card;
import main.java.Player;
import main.java.Suit;
import main.java.Value;
import main.java.Switch;

public class Test {
	
  public void testCard() {
    Card c = new Card(Suit.HEARTS, Value.EIGHT);
    Card x = new Card(Suit.HEARTS, Value.TWO);
    System.out.println(c.getSuit());
    System.out.println(c.getValue());
    System.out.println(c);
    System.out.println(c.isSameSuit(c));
    System.out.println(c.isSameValue(x));
  }
	
  public void testHashCode() {
    Card x = new Card(Suit.CLUBS, Value.FIVE); 
    Card y = new Card(Suit.CLUBS, Value.FIVE);
    Card z = new Card(Suit.CLUBS, Value.FIVE);
    System.out.println(x.getSuit().hashCode());
    System.out.println(y.getSuit().hashCode());
    System.out.println(z.getSuit().hashCode());
    System.out.println(x.getValue().hashCode());
    System.out.println(y.getValue().hashCode());
    System.out.println(z.getValue().hashCode());
    System.out.println(x.equals(y));
    System.out.println(x == y);
  }
	
  public void testPlayer(){
    Player p = new Player("Player 1");
    ArrayList<Card> hand = new ArrayList<Card>();
    Card x = new Card(Suit.CLUBS, Value.FIVE); 
    Card y = new Card(Suit.HEARTS, Value.FIVE);
    Card z = new Card(Suit.DIAMONDS, Value.FOUR);
    p.setHand(hand);
    hand.add(x);
    hand.add(y);
    hand.add(z);
    System.out.println(p.getName());
    System.out.println(p.getHand());
    System.out.println(p.getHandAsString());
    System.out.println(p.getHandSize());
  }
	
  public static void main(String[] args){
    Test t = new Test();
    t.testCard();
    t.testHashCode();
    t.testPlayer();
  }
}
