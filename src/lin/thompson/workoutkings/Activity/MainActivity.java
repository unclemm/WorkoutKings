package lin.thompson.workoutkings.Activity;

import lin.thompson.workout.Workout;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	Workout workout = new Workout();

	static String[] workouts = new String[] { "Create New Workout...", "Workout 1", "Workout 2", "Workout 3", "Workout 4" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new MobileArrayAdapter(this, workouts));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String selectedValue = (String) getListAdapter().getItem(position);
		if(Integer.parseInt(selectedValue) != 0) {
			Intent intent = new Intent(MainActivity.this, NewWorkoutActivity.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(MainActivity.this, MainWorkoutActivity.class);
			startActivity(intent);
		}
	}

}
