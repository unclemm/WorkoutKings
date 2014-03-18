package lin.thompson.deck;

public class Exercise {

	private String exerciseName;
	private String suit;
	
	public Exercise(String name, String suit) {
		this.exerciseName = name;
		this.suit = suit;
	}
	
	public String getExercise() {
		return exerciseName;
	}
	
	public String getAssociatedSuit() {
		return suit;
	}
}
