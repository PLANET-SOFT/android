package com.planetsoft.views;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements android.view.View.OnClickListener 
{

	private static final int DIALOG_SELECT_ACTIVITY_TYPE = 1;
	private static final int DIALOG_SELECT_NAME = 2;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.activity_menu_button_start).setOnClickListener(this);
		findViewById(R.id.activity_menu_button_stop).setOnClickListener(this);
		findViewById(R.id.activity_menu_button_track).setOnClickListener(this);
	}
		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	protected Dialog onCreateDialog(int id) {
		AlertDialog.Builder builder ;
		switch(id){
		case DIALOG_SELECT_ACTIVITY_TYPE:
			builder = new AlertDialog.Builder(this);
			return builder.create();
			
		
		
	case DIALOG_SELECT_NAME:
		builder = new AlertDialog.Builder(this);
		View view =getLayoutInflater().inflate(R.layout.activity_main_dialog_select_name,null);
		builder.setView(view);
		return builder.create();
	}
		return null;
	
	}



	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.activity_menu_button_start :
			showDialog(DIALOG_SELECT_ACTIVITY_TYPE);
			
			break;
			
		case R.id.activity_menu_button_stop :
			showDialog(DIALOG_SELECT_NAME);

			break;
			
		case R.id.activity_menu_button_track :
			break;
		}
		
	}



	
}
