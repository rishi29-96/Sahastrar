package com.bellurbis.sahastrar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
 
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Edusertname;
    EditText Edpassword;
    Button submitbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        Findviewbyid();
//        setSupportActionBar(toolbar);

    }
    public void Findviewbyid()
    {
        Edusertname=(EditText)findViewById(R.id.etname);
        Edpassword=(EditText)findViewById(R.id.etPassword2);
        submitbtn=(Button)findViewById(R.id.button);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AgliScreen.class);
                startActivity(intent);



            }
        });
    }

}

