package com.registrationapp.rehab.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    EditText username,password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        btnlogin=(Button)findViewById(R.id.login);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null) {
            username.setText(bundle.getString("name"));
            password.setText(bundle.getString("password"));

        }
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main4Activity.this,Main3Activity.class);
                intent.putExtra("name",username.getText().toString());
                intent.putExtra("password",password.getText().toString());
                startActivity(intent);
            }
        });
    }
}
