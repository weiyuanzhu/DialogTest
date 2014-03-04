package weiyuan.controllertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarTest extends Activity {
	
	private ProgressBar spin = null;
	private ProgressBar bar = null;
	private ProgressBar spinner = null;
	private Button okButton = null;
	private int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_bar_test);
		
		spin = (ProgressBar) findViewById (R.id.progressBar1);
		bar = (ProgressBar) findViewById(R.id.progressBar2);
		okButton = (Button) findViewById(R.id.button1);
		spinner = (ProgressBar) findViewById(R.id.progressBar3);
		
		System.out.println(bar.getMax());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progress_bar_test, menu);
		return true;
	}

	
	public void okClicked(View view)
	{
		if(i==0)
		{
			spin.setVisibility(View.VISIBLE); //用常量 提高可读性
			bar.setVisibility(View.VISIBLE);
			spinner.setVisibility(View.INVISIBLE);
			
		}
		else if(i<bar.getMax())		
		{
			bar.setProgress(i);
			bar.setSecondaryProgress(i+10);
			spin.setProgress(i);
		}
		else 
		{
			i = -10;
			bar.setProgress(i);
			bar.setSecondaryProgress(i);
			spin.setProgress(i);
			spin.setVisibility(View.GONE); //用常量 提高可读性
			bar.setVisibility(View.GONE);
			
			
			
		}
		
		i = i + 10;
	}
}
