package lin.thompson.workoutkings.Activity;

import lin.thompson.workoutkings.R;
import lin.thompson.workoutkings.R.layout;
import lin.thompson.workoutkings.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainWorkoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_workout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_workout, menu);
		return true;
	}

}
