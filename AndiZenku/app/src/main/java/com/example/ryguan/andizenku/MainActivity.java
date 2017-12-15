package com.example.ryguan.andizenku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public int countNumber = 0;
    public int[] freefood = new int[21];
    public int multiplier = 1;
    String s;
    public TextView t;
    public Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        freefood[0] = R.drawable.download;
        freefood[1] = R.drawable.download1;
        freefood[2] = R.drawable.download5;
        freefood[3] = R.drawable.download6;
        freefood[4] = R.drawable.download7;
        freefood[5] = R.drawable.download8;
        freefood[6] = R.drawable.download9;
        freefood[7] = R.drawable.download10;
        freefood[8] = R.drawable.download11;
        freefood[9] = R.drawable.download12;
        freefood[10] = R.drawable.download13;
        freefood[11] = R.drawable.download14;
        freefood[12] = R.drawable.download15;
        freefood[13] = R.drawable.download16;
        freefood[14] = R.drawable.download17;
        freefood[15] = R.drawable.download18;
        freefood[16] = R.drawable.download19;
        freefood[17] = R.drawable.download20;
        freefood[18] = R.drawable.download21;
        freefood[19] = R.drawable.download21;
        freefood[20] = R.drawable.download22;
        t = (TextView) findViewById(R.id.text);
        t.setText("0");



    }
    public void onClick(View v)
    {
        countNumber+=multiplier;
        v.setBackgroundResource(freefood[(int)(Math.random()*21)]);
        t.setText(countNumber+"");

    }

    public void shopOnClick(View v)
    {
        if(countNumber>=multiplier*10)
        {
            countNumber-=10*multiplier;
            multiplier++;
            t.setText(countNumber+"");
            r = (Button)findViewById(R.id.button);
            r.setText("$" + multiplier*10 +": +1/CLICK");

        }
    }
}


