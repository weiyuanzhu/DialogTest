package weiyuan.controllertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radio extends Activity {
	
	//声明成员变量
	private RadioGroup genderGroup = null;
	private RadioButton femaleButton = null;
	private RadioButton maleButton = null;
	private CheckBox swimBox = null;
	private CheckBox runBox = null;
	private CheckBox readBox = null;
	
		
			

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
		
		genderGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		maleButton = (RadioButton) findViewById(R.id.radio0);
		femaleButton = (RadioButton) findViewById(R.id.radio1);
		
		genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				
				if(checkedId == femaleButton.getId())
				{
					System.out.println("Female");
					Toast.makeText(Radio.this, "Female", Toast.LENGTH_SHORT).show();
					
					
				}
				else
					
					{
						System.out.println("Male");
						Toast.makeText(Radio.this, "Male", Toast.LENGTH_SHORT).show();
						
						
					}
					
				
				
			}
		});
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio, menu);
		return true;
	}

}
