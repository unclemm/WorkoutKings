package lin.thompson.factory;

import lin.thompson.deck.CardDeck;

public interface DeckFactory {	
	
	public CardDeck initializeCardDeck();
	
	public String getExerciseName(String suit);
	
	public String getNumOfReps(String cardNumber);
	
}
