package weiyuan.controllertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Result extends Activity {
	
	private TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		System.out.println("Activity2---->onCreate");
		
		result = (TextView) findViewById(R.id.result_textView1);
		Intent intent = getIntent();
		Integer r = intent.getIntExtra("result",0);
		
		result.setText(r.toString());
		
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity2---->onStart");
		super.onStart();
	}
	



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity2---->onResume");
		super.onResume();
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("Activity2---->onPause");
		super.onPause();
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("Activity2---->onRestart");
		super.onRestart();
	}




	


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("Activity2---->onStop");
		super.onStop();
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity2---->onDestory");
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
