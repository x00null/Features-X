package com.imu24r.featuresx;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeoutException;

import com.stericson.RootTools.RootTools;
import com.stericson.RootTools.exceptions.RootDeniedException;
import com.stericson.RootTools.execution.CommandCapture;


import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		// Show the Up button in the action bar.
		setupActionBar();
		
		
		@SuppressWarnings("unused")
		Intent intent = getIntent();
		
		
		WebView mWebView = (WebView) findViewById(R.id.webview);    
		  
		         String text = "<html><body>"
		                  + "<p align=\"justify\">"                
		                  + getString(R.string.med) 
		                  + "</p> "
		                  + "</body></html>";
		           
		        mWebView.loadData(text, "text/html", "utf-8");
		        
		        
		        InputStream input_14 = null;
				try {
					input_14 = getAssets().open("mod.sh");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        // myData.txt can't be more than 2 gigs.
		        int size_14 = 0;
				try {
					size_14 = input_14.available();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        byte[] buffer_14 = new byte[size_14];
		        try {
					input_14.read(buffer_14);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        try {
					input_14.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		        // byte buffer into a string
		        String text_14 = new String(buffer_14);
				
		        try
		        {
		            OutputStreamWriter fout=
		                new OutputStreamWriter(
		                    openFileOutput("mod.sh", Context.MODE_PRIVATE));
		         
		            fout.write(text_14);
		            fout.close();
		        }
		        catch (Exception ex)
		        {
		            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
		        }
	}
	
	public void viewxml (View view){
		ConnectivityManager connMgr = (ConnectivityManager) 
		        getSystemService(Context.CONNECTIVITY_SERVICE);
		    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		    if (networkInfo != null && networkInfo.isConnected()) {
		    	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pastebin.com/LWVkwMzy"));
				startActivity(browserIntent);
				
		    } else {
		       Toast.makeText(getApplicationContext(), "Network is currently unavailable", Toast.LENGTH_LONG).show();
		    }
		
		
		
	}
	
	public void modxml (View view){
		
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString();
		
		 try
	        {
	            OutputStreamWriter fout=
	                new OutputStreamWriter(
	                    openFileOutput("dinamic.txt", Context.MODE_PRIVATE));
	         
	            fout.write(message);
	            fout.close();
	        }
	        catch (Exception ex)
	        {
	            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
	        }
	        
		 
		
		CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 770 /data/data/com.imu24r.featuresx/files/dinamic.txt","chmod 770 /data/data/com.imu24r.featuresx/files/mod.sh","sh /data/data/com.imu24r.featuresx/files/mod.sh","mount -o ro,remount /dev/block/stl9 /system");
		try {
			RootTools.getShell(true).add(command).waitForFinish();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RootDeniedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
