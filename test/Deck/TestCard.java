package Deck;
import org.junit.Test;

import junit.framework.TestCase;
import lin.thompson.deck.Card;


public class TestCard extends TestCase {
	private Card card;
	
	@Test
	public void shouldReturnFive(){
		card = new Card(5,0);
		assertEquals(card.getNumber(),5);
	}
	
	public void shouldReturnClubs(){
		card = new Card(5,1);
		assertEquals(card.getSuit(), 0);
	}
	
	public void shouldReturnStringClubs(){
		card = new Card(5, 0);
		assertEquals(card.getSuitName(), "Clubs");
	}
}
