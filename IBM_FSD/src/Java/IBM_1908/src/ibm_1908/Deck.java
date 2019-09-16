package ibm_1908;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Deck {

	private static List<Card> protoDeck= new ArrayList<Card>();
	static{
		for(Hand h:Hand.values())
		{
		for(Suit s:Suit.values())
		{
			for(Rank r:Rank.values())
			{
				protoDeck.add(new Card(h,s,r));
			}
		}
	}
	}

	public static void main(String[] args) 
	{
		System.out.println(protoDeck);
	}
}
