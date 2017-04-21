package com.registrationapp.rehab.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText username,password,email;
    Button btnregister,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        btnregister=(Button)findViewById(R.id.register);
        btnlogin=(Button)findViewById(R.id.login);



        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                 intent.putExtra("name",username.getText().toString());
                 intent.putExtra("password",password.getText().toString());
                 intent.putExtra("email",email.getText().toString());
                 startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
