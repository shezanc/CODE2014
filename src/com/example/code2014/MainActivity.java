package com.example.code2014;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MainActivity extends Activity {

	ListView lvName;
	String[] name = {"Ontario","BC", "NovaScotia", "Alberta", "Manitoba", "Nunavat"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lvName = (ListView) findViewById(R.id.lv_Name);
		
		lvName.setAdapter(new ArrayAdapter<String>(MainActivity.this, 
				android.R.layout.simple_list_item_1, name));
		lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), name[position],  Toast.LENGTH_SHORT).show();
			}
		});
	
	}

	
}
