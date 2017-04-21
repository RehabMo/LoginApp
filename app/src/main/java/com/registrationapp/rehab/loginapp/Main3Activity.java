package com.registrationapp.rehab.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        hello =(TextView)findViewById(R.id.hello);
        Bundle bundle=getIntent().getExtras();

        if(bundle!=null) {
           // Toast.makeText(Main3Activity.this,nn,Toast.LENGTH_LONG).show();
            hello.setText("Hello "+bundle.getString("name")+ " , The registration is complete");

        }
    }
}
