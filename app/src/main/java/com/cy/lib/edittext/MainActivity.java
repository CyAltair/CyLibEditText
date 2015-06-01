package com.cy.lib.edittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt = (CyEditText) findViewById(R.id.edt);
		edt.setValidator(new PhoneValidator());
	}

	private CyEditText edt;
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.btn:
			//edt.setError("test");
			//edt.setError("test", getResources().getDrawable(R.mipmap.ic_launcher));
			edt.validate();
			break;

		default:
			break;
		}

	}

}
