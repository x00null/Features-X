package com.imu24r.featuresx;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeoutException;



import com.stericson.RootTools.RootTools;
import com.stericson.RootTools.exceptions.RootDeniedException;
import com.stericson.RootTools.execution.CommandCapture;


import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        InputStream input2 = null;
		try {
			input2 = getAssets().open("checkfile.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size2 = 0;
		try {
			size2 = input2.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer2 = new byte[size2];
        try {
			input2.read(buffer2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input2.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text2 = new String(buffer2);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("checkfile.sh", Context.MODE_PRIVATE));
         
            fout.write(text2);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        InputStream input3 = null;
		try {
			input3 = getAssets().open("addexitmenubrow.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size3 = 0;
		try {
			size3 = input3.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer3 = new byte[size3];
        try {
			input3.read(buffer3);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input3.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text3 = new String(buffer3);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("addexitmenubrow.sh", Context.MODE_PRIVATE));
         
            fout.write(text3);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        InputStream input4 = null;
		try {
			input4 = getAssets().open("camerashuter.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size4 = 0;
		try {
			size4 = input4.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer4 = new byte[size4];
        try {
			input4.read(buffer4);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input4.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text4 = new String(buffer4);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("camerashuter.sh", Context.MODE_PRIVATE));
         
            fout.write(text4);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        InputStream input5 = null;
		try {
			input5 = getAssets().open("confirmexitbrow.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size5 = 0;
		try {
			size5 = input5.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer5 = new byte[size5];
        try {
			input5.read(buffer5);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input5.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text5 = new String(buffer5);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("confirmexitbrow.sh", Context.MODE_PRIVATE));
         
            fout.write(text5);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        InputStream input6 = null;
		try {
			input6 = getAssets().open("dialersearch.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size6 = 0;
		try {
			size6 = input6.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer6 = new byte[size6];
        try {
			input6.read(buffer6);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input6.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text6 = new String(buffer6);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("dialersearch.sh", Context.MODE_PRIVATE));
         
            fout.write(text6);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        InputStream input7 = null;
		try {
			input7 = getAssets().open("extendcontactlen.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size7 = 0;
		try {
			size7 = input7.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer7 = new byte[size7];
        try {
			input7.read(buffer7);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input7.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text7 = new String(buffer7);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("extendcontactlen.sh", Context.MODE_PRIVATE));
         
            fout.write(text7);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        InputStream input8 = null;
		try {
			input8 = getAssets().open("infinitescrolling.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size8 = 0;
		try {
			size8 = input8.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer8 = new byte[size8];
        try {
			input8.read(buffer8);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input8.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text8 = new String(buffer8);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("infinitescrolling.sh", Context.MODE_PRIVATE));
         
            fout.write(text8);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        InputStream input_9 = null;
		try {
			input_9 = getAssets().open("newline.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size_9 = 0;
		try {
			size_9 = input_9.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer_9 = new byte[size_9];
        try {
			input_9.read(buffer_9);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input_9.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text_9 = new String(buffer_9);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("newline.sh", Context.MODE_PRIVATE));
         
            fout.write(text_9);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        
        InputStream input_10 = null;
		try {
			input_10 = getAssets().open("nljoiningcontacts.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size_10 = 0;
		try {
			size_10 = input_10.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer_10 = new byte[size_10];
        try {
			input_10.read(buffer_10);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input_10.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text_10 = new String(buffer_10);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("nljoiningcontacts.sh", Context.MODE_PRIVATE));
         
            fout.write(text_10);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        
        
        InputStream input_11 = null;
		try {
			input_11 = getAssets().open("sch-messa.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size_11 = 0;
		try {
			size_11 = input_11.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer_11 = new byte[size_11];
        try {
			input_11.read(buffer_11);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input_11.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text_11 = new String(buffer_11);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("sch-messa.sh", Context.MODE_PRIVATE));
         
            fout.write(text_11);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        
        
        InputStream input_12 = null;
		try {
			input_12 = getAssets().open("extendspeedial100.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size_12 = 0;
		try {
			size_12 = input_12.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer_12 = new byte[size_12];
        try {
			input_12.read(buffer_12);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input_12.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text_12 = new String(buffer_12);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("extendspeedial100.sh", Context.MODE_PRIVATE));
         
            fout.write(text_12);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        InputStream input_13 = null;
		try {
			input_13 = getAssets().open("backup.sh");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        // myData.txt can't be more than 2 gigs.
        int size_13 = 0;
		try {
			size_13 = input_13.available();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        byte[] buffer_13 = new byte[size_13];
        try {
			input_13.read(buffer_13);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			input_13.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // byte buffer into a string
        String text_13 = new String(buffer_13);
		
        try
        {
            OutputStreamWriter fout=
                new OutputStreamWriter(
                    openFileOutput("backup.sh", Context.MODE_PRIVATE));
         
            fout.write(text_13);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        
        InputStream input_14 = null;
		try {
			input_14 = getAssets().open("restore.sh");
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
                    openFileOutput("restore.sh", Context.MODE_PRIVATE));
         
            fout.write(text_14);
            fout.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        
        
        // storing string resources into Array
        String[] adobe_products = getResources().getStringArray(R.array.adobe_products);
        
        // Binding Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, adobe_products));
        
        ListView lv = getListView();

        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
        	  
        	 
        	  
        	  if(position==0){
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/addexitmenubrow.sh","sh /data/data/com.imu24r.featuresx/files/addexitmenubrow.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast toast1 =
        	             Toast.makeText(getApplicationContext(),
        	                     "Modified! Make a reboot!", Toast.LENGTH_LONG);
        	  
        	         toast1.show();
        		  
        	  }else if(position==1){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/camerashuter.sh","sh /data/data/com.imu24r.featuresx/files/camerashuter.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        		  
        	  }else if(position==2){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/confirmexitbrow.sh","sh /data/data/com.imu24r.featuresx/files/confirmexitbrow.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        	  }else if(position==3){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/dialersearch.sh","sh /data/data/com.imu24r.featuresx/files/dialersearch.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        	  }else if(position==4){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/extendcontactlen.sh","sh /data/data/com.imu24r.featuresx/files/extendcontactlen.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        	  }else if(position==5){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/extendspeedial100.sh","sh /data/data/com.imu24r.featuresx/files/extendspeedial100.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        	  }else if(position==6){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/infinitescrolling.sh","sh /data/data/com.imu24r.featuresx/files/infinitescrolling.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        		  
        	  }else if(position==7){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/newline.sh","sh /data/data/com.imu24r.featuresx/files/newline.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        	  }else if(position==8){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/nljoiningcontacts.sh","sh /data/data/com.imu24r.featuresx/files/nljoiningcontacts.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        		  
        	  }else if(position==9){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/checkfile.sh","sh /data/data/com.imu24r.featuresx/files/checkfile.sh","rm /data/data/com.imu24r.featuresx/files/checkfile.sh ","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        	  }else if(position==10) {
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/sch-messa.sh","sh /data/data/com.imu24r.featuresx/files/sch-messa.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        	 	 Toast.makeText(getApplicationContext(),
				         "Modified! Make a reboot!", Toast.LENGTH_LONG).show();
        	  }else if(position==11){
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/backup.sh","sh /data/data/com.imu24r.featuresx/files/backup.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        		  
        		  
        	  }else if(position==12){
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","chmod 700 /data/data/com.imu24r.featuresx/files/restore.sh","sh /data/data/com.imu24r.featuresx/files/restore.sh","mount -o ro,remount /dev/block/stl9 /system");
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
        		  
        	  }else{
        		  
        		  CommandCapture command = new CommandCapture(0,"mount -o rw,remount /dev/block/stl9 /system","reboot","mount -o ro,remount /dev/block/stl9 /system");
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
        	  	  
        	  
          }
          
          
        });
    }
    
	
}