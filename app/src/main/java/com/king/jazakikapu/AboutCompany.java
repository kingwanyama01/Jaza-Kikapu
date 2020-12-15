package com.king.jazakikapu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutCompany extends AppCompatActivity {

    TextView aboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_company);

        aboutApp= (TextView)findViewById(R.id.aboutApp);
        aboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutCompany.this, AboutApp.class);
                startActivity(intent);
            }
        });
    }
}