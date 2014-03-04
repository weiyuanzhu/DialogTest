package weiyuan.controllertest;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;

public class ControllerTest extends Activity {
	
	private EditText mEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_controller_test);
		
		mEditText = (EditText) findViewById(R.id.testEditText);
		mEditText.setOnLongClickListener(new mOnClickListener());

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.controller_test, menu);
		return true;
	}
	
	class  mOnClickListener implements OnLongClickListener
	{
		@Override
		public boolean onLongClick(View arg0) {
			System.out.println("LongClick");
			FireMissilesDialogFragment fire = new FireMissilesDialogFragment();
			fire.show(getFragmentManager(), "testDialogFragment");
			return false;
		}
	}

	@SuppressLint("ValidFragment")
	public class FireMissilesDialogFragment extends DialogFragment {
	    @Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) {
	        // Use the Builder class for convenient dialog construction
	        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        
	        
	        
	        LayoutInflater inflater = getActivity().getLayoutInflater();
	        
	        final View inflator = inflater.inflate(R.layout.dialog_signin, null);
	        
	        
	        
	        builder.setView(inflator)
	        
	     
	               .setPositiveButton("Set", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                	  EditText username = (EditText) inflator.findViewById(R.id.username);
	                	  String str = username.getText().toString();
	                      System.out.println(str);
	                      mEditText.setText(str);
	                   }
	               })
	               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                       // User cancelled the dialog
	                   }
	               });
	        // Create the AlertDialog object and return it
	        return builder.create();
	    }
	
	
	}
}
