package com.exa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
    }
    public void click1(View v){
    	try {
			File file = new File(getCacheDir(),"info.txt");
			FileOutputStream fos=new FileOutputStream(file);
			fos.write("hehehe".getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
public void click2(View v){
    	try {
			FileOutputStream fos = openFileOutput("info.txt", 0);
			fos.write("hugfddd".getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
