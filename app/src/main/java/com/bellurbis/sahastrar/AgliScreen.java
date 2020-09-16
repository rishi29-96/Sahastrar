package com.bellurbis.sahastrar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AgliScreen extends AppCompatActivity {






        // Array of strings...
        String[] mobileArray = {"Tapan","Gaurav","yash","kanak","rishi","babua"};


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agli_screen);

            ArrayAdapter adapter = new ArrayAdapter<String>(this,
                    R.layout.activity_listview, mobileArray);

            ListView listView = (ListView) findViewById(R.id.etlist);
        listView.setAdapter(adapter);
    }
}

