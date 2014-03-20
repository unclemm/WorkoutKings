package lin.thompson.workoutkings.Activity;

import lin.thompson.deck.CardDeck;
import lin.thompson.workout.Workout;
import lin.thompson.workoutkings.R;
import lin.thompson.workoutkings.R.id;
import lin.thompson.workoutkings.R.layout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class WorkoutActivity extends ActionBarActivity {
	
	Workout workout;
	CardDeck deck;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public WorkoutActivity(Workout workout) {
		this.workout = workout;
		this.deck = workout.getDeck();
	}
	
	public Workout getWorkout() {
		return workout;
	}
	
	// This is private for now, may want to make it either public or delete the entire method later
	private void changeWorkout(Workout newWorkout) {
		this.workout = newWorkout;
	}

}
