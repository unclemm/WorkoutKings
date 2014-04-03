package lin.thompson.factory;

import lin.thompson.deck.CardDeck;

public class HardCodeFactory implements DeckFactory{
	private CardDeck deck;
	@Override
	public CardDeck initializeCardDeck() {
		deck = new CardDeck();
		return deck;
	}
	
	//public ____ getCardPicture(String suit, String number) {
		
	//}
	
	@Override
	public String getExerciseName(String suit) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String getNumOfReps(String cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
