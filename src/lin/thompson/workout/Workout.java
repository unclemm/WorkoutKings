package lin.thompson.workout;

import java.util.ArrayList;

import lin.thompson.deck.Card;
import lin.thompson.deck.CardDeck;
import lin.thompson.deck.Exercise;

public class Workout {
	
	private String name;
	private CardDeck deck;
	private ArrayList<Exercise> exercises;
	
	public Workout(String name, CardDeck deck) {
		this.name = name;
		this.deck = deck;
	}
	
	public Workout() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Exercise> getExercises() {
		return exercises;
	}

	public void addExercise(Exercise e) {
		exercises.add(e);
	}
	
	public ArrayList<Card> getCards() {
		return deck.getCards();
	}
	
	public void addCard(Card card) {
		deck.addCard(card);
	}
	
	public CardDeck getDeck() {
		return deck;
	}

	public String toString() {
		StringBuilder returnString = new StringBuilder();
		returnString.append(name + "\n");
		for(Exercise exercise : exercises) {
			returnString.append("," + exercise.getExercise());
		}
		return returnString.toString();
	}
	
	public Workout hardcodedWorkout() {
		Workout hardcodedWorkout = new Workout();
		hardcodedWorkout.setName("Hardcoded");
		hardcodedWorkout.addExercise(new Exercise("Pushups", "Clubs"));
		hardcodedWorkout.addCard(new Card(0, 0));
		hardcodedWorkout.addCard(new Card(0, 1));
		
		return hardcodedWorkout;
	}
}
