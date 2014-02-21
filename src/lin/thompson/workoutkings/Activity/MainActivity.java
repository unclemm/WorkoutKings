package lin.thompson.workoutkings.Activity;

import lin.thompson.workoutkings.R;
import lin.thompson.workoutkings.R.id;
import lin.thompson.workoutkings.R.layout;
import lin.thompson.workoutkings.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
	    Button presetWorkoutButton = (Button) findViewById(R.id.presetworkoutbutton);
	    Button customWorkoutButton = (Button)findViewById(R.id.customworkoutbutton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View v){

	    if(v.getId() == R.id.customworkoutbutton){
	        Intent intent = new Intent(MainActivity.this, NewWorkoutActivity.class);
	            startActivity(intent);   

	    } else if(v.getId() == R.id.presetworkoutbutton){
	        Intent intent = new Intent(MainActivity.this, PresetWorkoutActivity.class);
	            startActivity(intent);  
	    }

	}
}
