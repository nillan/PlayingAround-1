package com.example.playingaround;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	
	public final static String AM1 = "com.example.playingaround.MESSAGE1";
	public final static String AM2 = "com.example.playingaround.MESSAGE2";
	public final static String AM3 = "com.example.playingaround.MESSAGE3";
	public final static String AM4 = "com.example.playingaround.MESSAGE4";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
	
	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText1 = (EditText) findViewById(R.id.type_amount1);
		String message = editText1.getText().toString();
		double am1 = Double.parseDouble(message);
		
		EditText editText2 = (EditText) findViewById(R.id.type_amount2);
		message = editText2.getText().toString();
		double am2 = Double.parseDouble(message);
		
		EditText editText3 = (EditText) findViewById(R.id.type_amount3);
		message = editText3.getText().toString();
		double am3 = Double.parseDouble(message);
		
		EditText editText4 = (EditText) findViewById(R.id.type_amount4);
		message = editText4.getText().toString();
		double am4 = Double.parseDouble(message);
		
		EditText editText5 = (EditText) findViewById(R.id.full_amount);
		message = editText5.getText().toString();
		double full = Double.parseDouble(message);
		
		double before = am1 + am2 + am3 + am4;
		
		double inflator = full/ before;
		
		am1 = am1 * inflator;
		am2 = am2 * inflator;
		am3 = am3 * inflator;
		am4 = am4 * inflator;
		
		EditText editName1 = (EditText) findViewById(R.id.type_name1);
		String message1 = editName1.getText().toString();
		
		message1 = message1 + " " + am1;
		
		intent.putExtra(AM1, message1);
		
		EditText editName2 = (EditText) findViewById(R.id.type_name2);
		String message2 = editName2.getText().toString();
		
		message2 = message2 + " " + am2;
		
		intent.putExtra(AM2, message2);
		
		EditText editName3 = (EditText) findViewById(R.id.type_name3);
		String message3 = editName3.getText().toString();
		
		message3 = message3 + " " + am3;
		
		intent.putExtra(AM3, message3);
		
		EditText editName4 = (EditText) findViewById(R.id.type_name4);
		String message4 = editName4.getText().toString();
		
		message4 = message4 + " " + am4;
		
		intent.putExtra(AM4, message4);
		
		System.out.println(message1 + " " + message2 + " " + message3 + " " + message4);
		
		startActivity(intent);

	}
}
