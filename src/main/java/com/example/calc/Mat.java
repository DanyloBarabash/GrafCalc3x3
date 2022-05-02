package com.example.calc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat);

        Intent i=getIntent();
        TextView t[]= new TextView[10];
        int result[]=i.getIntArrayExtra("Extra");
        int j;

        String g[]=new String[9];

        for(j=0;j<9;j++){
            String s="T"+j;
            t[j]=findViewById(getResources().getIdentifier(s,"id",getPackageName()));

        }
        t[9]=findViewById(R.id.T9);
        String n=i.getStringExtra("which");
        t[9].setText(n);

        for (j=0;j<9;j++){
            g[j]=Integer.toString(result[j]);
        }
        for (j=0;j<9;j++){
            t[j].setText(g[j]);
        }
    }
}