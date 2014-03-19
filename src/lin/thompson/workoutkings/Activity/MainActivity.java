package lin.thompson.workoutkings.Activity;

import lin.thompson.workout.Workout;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	Workout workout = new Workout();

	static String[] workouts = new String[] { "Create New Workout...", "Workout 1", "Workout 2", "Workout 3", "Workout 4" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new MobileArrayAdapter(this, workouts));

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
				if(position == 1) {
		            // "Create New Workout" was clicked   
		            Intent intent = new Intent(view.getContext(), NewWorkoutActivity.class);
		            startActivity(intent);
		        } else {
		            // Anything else was clicked    
		            Intent intent = new Intent(view.getContext(), WorkoutActivity.class);
		            startActivity(intent);
		        }                 
			}
		});
	}
}
