package com.example.android_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class Register_Activity extends AppCompatActivity {
    DatabaseHelper db;

    EditText e1,e2,e3,e4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        TextView btn=findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register_Activity.this,Login.class));
            }
        });
        db = new DatabaseHelper(this);
        e4=(EditText)findViewById(R.id.inputUsername);
        e1=(EditText)findViewById(R.id.inputName);
        e2=(EditText)findViewById(R.id.inputPassword);
        e3=(EditText)findViewById(R.id.inputConfirmPassword);
        b1=(Button)findViewById(R.id.btnRegister);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                if(s4.equals("") || s1.equals("") || s2.equals("") || s3.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(s2.equals(s3)){
                        Boolean chkemail = db.chkemail(s1);
                        if(chkemail==true){
                            Boolean insert = db.insert(s4,s1,s2);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Email already exists",Toast.LENGTH_SHORT).show();;
                        }
                    }
                    Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
