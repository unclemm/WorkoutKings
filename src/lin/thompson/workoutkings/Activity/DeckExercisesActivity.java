package lin.thompson.workoutkings.Activity;

import java.util.ArrayList;

import lin.thompson.workoutkings.R;
import lin.thompson.workoutkings.R.id;
import lin.thompson.workoutkings.R.layout;
import lin.thompson.workoutkings.R.menu;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class DeckExercisesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deck_exercises);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preset_deck_exercises, menu);
		return true;
	}
	
	public void onClick(View v){
	    if(v.getId() == R.id.backbuttonpresetdeckexercises) {
	        finish(); 
	    } else if (v.getId() == R.id.newexercisebutton) {
	    	Intent intent = new Intent(DeckExercisesActivity.this, NewExerciseActivity.class);
	    		startActivity(intent);
	    } else if (v.getId() == R.id.readybutton) {
	    	if(fourChecked()) {
	    		Intent intent = new Intent(DeckExercisesActivity.this, ChooseCardsActivity.class);
	    			startActivity(intent);
	    	} else { 
	    		// Must check 4 exercises 
	    	}
	    }
	}
	
	public boolean fourChecked() {
		int count = 0;
//		ArrayList<CheckBox> tempList = new ArrayList<CheckBox>();
//		tempList.add((CheckBox) findViewById(R.id.checkBox1));
//		tempList.add((CheckBox) findViewById(R.id.checkBox2));
//		tempList.add((CheckBox) findViewById(R.id.checkBox3));
//		tempList.add((CheckBox) findViewById(R.id.checkBox4));
//		for(CheckBox box : tempList) {
//			if(box.isChecked()) count++;
//		}
		if(((CompoundButton) findViewById(R.id.checkBox1)).isChecked()) { count++; }
		if(((CompoundButton) findViewById(R.id.checkBox2)).isChecked()) { count++; }
		if(((CompoundButton) findViewById(R.id.checkBox3)).isChecked()) { count++; }
		if(((CompoundButton) findViewById(R.id.checkBox4)).isChecked()) { count++; }
		
		if(count == 4) { return true; }
		else { return false; }
	}
}
