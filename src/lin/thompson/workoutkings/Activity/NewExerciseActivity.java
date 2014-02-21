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

public class NewExerciseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_exercise);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_exercise, menu);
		return true;
	}

	public void onClick(View v){

	    if(v.getId() == R.id.savenewexercisebutton){
	        // Implement saving of a new exercise   
	    	finish();
	    } else if (v.getId() == R.id.backbuttonnewexercise) {
	    	finish();
	    }
	}

}
