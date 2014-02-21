package lin.thompson.workoutkings.Activity;

import lin.thompson.workoutkings.R;
import lin.thompson.workoutkings.R.id;
import lin.thompson.workoutkings.R.layout;
import lin.thompson.workoutkings.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class NewWorkoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_workout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_workout, menu);
		return true;
	}
	
	public void onClick(View v){

	    if(v.getId() == R.id.backbutton){
	        finish(); 
	    } else if (v.getId() == R.id.custombutton || v.getId() == R.id.fulldeckbutton) {
	    	Intent intent = new Intent(NewWorkoutActivity.this, Deck4ExercisesActivity.class);
	    		startActivity(intent);
	    } else if (v.getId() == R.id.halfdeckbutton) {
	    	Intent intent = new Intent(NewWorkoutActivity.this, Deck2ExercisesActivity.class);
	    		startActivity(intent);
	    }
	}

}
