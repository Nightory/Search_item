package com.example.search_item2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button butplay, butset,butexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        butplay=(Button) findViewById(R.id.buttonplay);
        butset=(Button) findViewById(R.id.buttonset);
        butexit=(Button) findViewById(R.id.buttonexit);
        Intent i=new Intent(MainActivity.this,PlayActivity1.class);
        startActivity(i);
        butplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PlayActivity1.class);
                startActivity(i);
            }
        });
        butset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        butexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }
}