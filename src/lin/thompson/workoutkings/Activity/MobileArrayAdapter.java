package lin.thompson.workoutkings.Activity;

import lin.thompson.workoutkings.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// You should be able to see this now.
public class MobileArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public MobileArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_mobile, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_mobile, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);
		
		if(s.equals("Create New Workout...")) {
			imageView.setImageResource(R.drawable.plus);
		} else if (s.equals("Workout 1")) {
			imageView.setImageResource(R.drawable.flex);
		} else if (s.equals("Workout 2")) {
			imageView.setImageResource(R.drawable.flex);
		} else if (s.equals("Workout 3")) {
			imageView.setImageResource(R.drawable.flex);
		} else if (s.equals("Workout 4")) {
			imageView.setImageResource(R.drawable.flex);
		}

		return rowView;
	}
}
