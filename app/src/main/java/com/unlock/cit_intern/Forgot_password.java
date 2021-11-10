package com.unlock.cit_intern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Forgot_password extends AppCompatActivity {

    private Spinner s2,s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        s1 = findViewById(R.id.login_spinner);
        s2 = findViewById(R.id.reset_spinner);
        String[] str1 = {"Select","Email/Password","Phone/Password","Phone/OTP"};
        String[] str2 = {"Select","Email/OTP","Phone/OTP"};

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, str1);
        s1.setAdapter(aa);
        s1.setSelection(0);
        ArrayAdapter<String> aa2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, str2);
        s2.setAdapter(aa2);
        s2.setSelection(0);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1)
                {
                    startActivity((new Intent(Forgot_password.this,Login_Email.class)));
                }
                if(position==2)
                {
                    startActivity((new Intent(Forgot_password.this,Login_Phone_Pass.class)));
                }
                if(position==3)
                {
                    startActivity((new Intent(Forgot_password.this,Login_Phone.class)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1)
                {
                    startActivity((new Intent(Forgot_password.this,ResetpassEmail.class)));
                }
                if(position==2)
                {
                    startActivity((new Intent(Forgot_password.this,ResetPassPhone.class)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}