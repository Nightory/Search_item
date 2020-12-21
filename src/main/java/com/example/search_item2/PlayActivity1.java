package com.example.search_item2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity1 extends AppCompatActivity {
String [] ItemName = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
Button butmenu,buthint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_play1);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        text1 = (TextView) findViewById(R.id.Item1);
        text2 = (TextView) findViewById(R.id.Item2);
        text3 = (TextView) findViewById(R.id.Item3);
        text4 = (TextView) findViewById(R.id.Item4);
        text5 = (TextView) findViewById(R.id.Item5);
        text6 = (TextView) findViewById(R.id.Item6);
        text7 = (TextView) findViewById(R.id.Item7);
        text8 = (TextView) findViewById(R.id.Item8);
        text9 = (TextView) findViewById(R.id.Item9);
        text10 = (TextView) findViewById(R.id.Item10);
        butmenu = (Button) findViewById(R.id.buttonmenu);
        buthint = (Button) findViewById(R.id.buttonhint);
        CreateList();
        butmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayActivity1.this.finish();
            }
        });
    }
    public void CreateList()
    {
        int k=0;
        Random r = new Random();
        int num=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,num10=0;
        while(k==0)
        {
            num = r.nextInt(15);
            num2 = r.nextInt(15);
            num3 = r.nextInt(15);
            num4 = r.nextInt(15);
            num5 = r.nextInt(15);
            num6 = r.nextInt(15);
            num7 = r.nextInt(15);
            num8 = r.nextInt(15);
            num9 = r.nextInt(15);
            num10 = r.nextInt(15);
            if(num2==num || (num3==num2 || num3==num)||(num4==num3 || num4==num2 || num4==num)
            || (num5==num4 || num5==num3 || num5==num2 || num5==num)||(num6==num5 || num6==num4 || num6==num3 || num6==num2 || num6==num)
            ||(num7==num6 || num7==num5 || num7==num4 || num7==num3 || num7==num2 || num7==num)|| (num8==num7 || num8==num6 || num8==num5
                    || num8==num4 || num8==num3 || num8==num2 || num8==num)||(num9==num8 || num9==num7 || num9==num6 || num9==num5
                    || num9==num4 || num9==num3 || num9==num2 || num9==num)||(num10==num9 || num10==num8 || num10==num7 || num10==num6 || num10==num5
                    || num10==num4 || num10==num3 || num10==num2 || num10==num))
            {
                num = r.nextInt(15);
                num2 = r.nextInt(15);
                num3 = r.nextInt(15);
                num4 = r.nextInt(15);
                num5 = r.nextInt(15);
                num6 = r.nextInt(15);
                num7 = r.nextInt(15);
                num8 = r.nextInt(15);
                num9 = r.nextInt(15);
                num10 = r.nextInt(15);
            }
            else k=1;

        }

        text1.setText(ItemName[num]+"");
        text2.setText(ItemName[num2]+"");
        text3.setText(ItemName[num3]+"");
        text4.setText(ItemName[num4]+"");
        text5.setText(ItemName[num5]+"");
        text6.setText(ItemName[num6]+"");
        text7.setText(ItemName[num7]+"");
        text8.setText(ItemName[num8]+"");
        text9.setText(ItemName[num9]+"");
        text10.setText(ItemName[num10]+"");
    }
}