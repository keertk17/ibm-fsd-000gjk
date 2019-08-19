package ibm_1908;

public class Card {
	private Suit suit;
	private Rank rank;
	private Hand hand;
 public Card(Hand hand,Suit suit,Rank rank)
 {
	 super();
	 this.hand=hand;
	 this.suit=suit;
	 this.rank=rank;
	
 }
 public Suit suit() {
	 return suit;
 }
 
 public Rank rank() {
	 return rank;
 }
 public Hand hand() {
	 return hand;
 }
@Override
public String toString() {
	return "Card [ Hand=" + hand +", suit=" + suit + ", rank=" + rank + "]\n";
}
 
}
