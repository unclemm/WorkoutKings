package lin.thompson.workoutkings.Activity;

import lin.thompson.workout.Workout;

public class WorkoutActivity {

	Workout workout;
	
	public WorkoutActivity(Workout workout) {
		this.workout = workout;
	}
	
	public Workout getWorkout() {
		return workout;
	}
	
	// This is private for now, may want to make it either public or delete the entire method later
	private void changeWorkout(Workout newWorkout) {
		this.workout = newWorkout;
	}
}
