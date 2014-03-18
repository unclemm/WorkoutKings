/**
 * 
 */
package lin.thompson.deck;

/**
 * @author Hsiang
 *
 */
public class ExerciseCard extends Card {
	
	private String exercise;

	public ExerciseCard(int s, int n, String exercise) {
		super(s, n);
		this.exercise = exercise;
		// TODO Auto-generated constructor stub
	}
	
	public String getExerciseName(){
		return exercise;
	}
	
}
