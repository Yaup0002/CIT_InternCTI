package com.unlock.cit_intern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameorders,
                    new NewOrderFragment()).commit();
        }
        tv1 = findViewById(R.id.neworder);
        tv2 = findViewById(R.id.ongoing);
        tv3 = findViewById(R.id.past);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
    }
    public void ChangeFragment(View v)
    {
        Fragment fragment ;
        if(v == findViewById(R.id.neworder))
        {
            fragment = new NewOrderFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frameorders , fragment);
            ft.commit();
        }
        if(v == findViewById(R.id.ongoing))
        {
            fragment = new OngoingOrderFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frameorders , fragment);
            ft.commit();
        }
        if(v == findViewById(R.id.past))
        {
            fragment = new PastOrderFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frameorders , fragment);
            ft.commit();
        }

    }
}