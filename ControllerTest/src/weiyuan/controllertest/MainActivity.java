package weiyuan.controllertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText a;
	private EditText b;
	private TextView title;
	private Button x;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		System.out.println("Activity1---->onCreate");
		
		a = (EditText) findViewById(R.id.main_editText1);
		b = (EditText) findViewById(R.id.main_editText2);
		title = (TextView) findViewById(R.id.main_textView1);
		x = (Button) findViewById(R.id.main_button1);
		
		title.setText("Chengfa");
		x.setText("计算");
		//x.setOnClickListener(new MyButtonListener());
		
	}
	
	

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity1---->onStart");
		super.onStart();
	}
	



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity1---->onResume");
		super.onResume();
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("Activity1---->onPause");
		super.onPause();
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("Activity1---->onRestart");
		super.onRestart();
	}




	


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("Activity1---->onStop");
		super.onStop();
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Activity1---->onDestory");
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		menu.add(0,1,3,"exit");
		menu.add(1,2,1,"about");
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		if(item.getItemId()==1)
		{
			finish();
			
		}
		
		
		
		return super.onOptionsItemSelected(item);
	}

	public void xClicked(View view)
	{
		
		String str1 = (String) a.getText().toString();
		String str2 = (String) b.getText().toString();
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		int c = a*b;
		
		Intent intent = new Intent(this, Result.class);
		intent.putExtra("result",c);
		
		startActivity(intent);
		
		
		
		
	}
	
	/*class MyButtonListener implements OnClickListener
	{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
	}*/

	


}
	

