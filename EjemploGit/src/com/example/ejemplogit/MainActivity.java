package com.example.ejemplogit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView texto= (TextView) this.findViewById(R.id.texto1);
		texto.setText("Branch 1");

		//comentario nuevo
		// Otro comentario
		//Otro de cristian
		//otro
		//nuevo 2
		//branch1
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
