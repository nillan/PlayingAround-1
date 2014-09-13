package com.example.playingaround;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();

	    // Create the text view
	    String message1 = intent.getStringExtra(MainActivity.AM1);
	    TextView textView1 = new TextView(this);
	    textView1.setTextSize(12);
	    textView1.setText(message1);
	    
	    String message2 = intent.getStringExtra(MainActivity.AM2);
	    TextView textView2 = new TextView(this);
	    textView2.setTextSize(12);
	    textView2.setText(message2);
	    
	    String message3 = intent.getStringExtra(MainActivity.AM3);
	    TextView textView3 = new TextView(this);
	    textView1.setTextSize(12);
	    textView1.setText(message3);
	    
	    String message4 = intent.getStringExtra(MainActivity.AM4);
	    TextView textView4 = new TextView(this);
	    textView4.setTextSize(12);
	    textView4.setText(message4);
	    
	    String mess = message1 + message2 + message3 + message4;
	    
	    TextView textView5 = new TextView(this);
	    textView5.setTextSize(15);
	    textView5.setText(mess);
	    
	    // Create a ViewGroup
	    
	    LinearLayout viewGroup = new LinearLayout(this);
	    viewGroup.setOrientation(1);
	    viewGroup.addView((View) textView1);
	    //viewGroup.addView((View) textView2);
	    //viewGroup.addView((View) textView3);
	    //viewGroup.addView((View) textView4);

	    // Set the text view as the activity layout
	    setContentView(viewGroup);
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
}
