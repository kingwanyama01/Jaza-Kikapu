package com.king.jazakikapu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Dashboard extends AppCompatActivity {

    FloatingActionButton partners;
//    ImageButton userProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        partners=(FloatingActionButton)findViewById(R.id.partners);
        partners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Partners.class);
                startActivity(intent);
            }
        });

//        userProfile = (ImageButton) findViewById(R.id.userProfile);
//        userProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Dashboard.this, UserProfile.class);
//                startActivity(intent);
//            }
//        });
    }

    public void kikapu(MenuItem item) {
        Toast.makeText(this, "Kikapu", Toast.LENGTH_SHORT).show();
    }

    public void profile(MenuItem item) {
        startActivity(new Intent(getApplicationContext(),SignIn.class));
    }

    public void donate(MenuItem item) {
        Toast.makeText(this, "Donate", Toast.LENGTH_SHORT).show();
    }
}