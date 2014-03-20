package lin.thompson.workoutkings.Activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class PresetWorkoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preset_workout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preset_workout, menu);
		return true;
	}
	
	public void onClick(View v){

	    if(v.getId() == R.id.backbuttonpresetworkout){
	        finish(); 
	    } else if (v.getId() == R.id.custombutton) {
	    	Intent intent = new Intent(PresetWorkoutActivity.this, Deck4ExercisesActivity.class);
	    		startActivity(intent);
	    	finish();
	    }
	}
}
