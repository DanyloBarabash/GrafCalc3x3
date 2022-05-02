package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Addition(View view) {
            EditText e[][] = new EditText[2][9];
            int read1[] = new int[9];
            int read2[] = new int[9];
            int result[] = new int[9];

            int i, j;

            for (i = 0; i < 2; i++) {
                for (j = 0; j < 9; j++) {
                    String s = "T" + i + j;
                    e[i][j] = findViewById((getResources().getIdentifier(s, "id", getPackageName())));
                }
            }
            for(i = 0; i< 2; i++){
                for (j = 0; j < 9; j++) {
                    if (i == 0) {
                        read1[j] = Integer.parseInt((e[i][j].getText().toString()));
                    }
                    if (i == 1) {
                        read2[j] = Integer.parseInt((e[i][j].getText().toString()));
                    }
                }
            }
            for (j=0;j<9;j++) {
                result[j]=read1[j]+read2[j];
            }
            Intent i1=new Intent(this,Mat.class);
            i1.putExtra("Extra",result);
            String n="Addition";
            i1.putExtra("which",n);
            startActivity(i1);

    }

    public void Subtraction(View view) {
        EditText e[][] = new EditText[2][9];
        int read1[] = new int[9];
        int read2[] = new int[9];
        int result[] = new int[9];

        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 9; j++) {
                String s = "T" + i + j;
                e[i][j] = findViewById((getResources().getIdentifier(s, "id", getPackageName())));
            }
        }
        for(i = 0; i< 2; i++){
            for (j = 0; j < 9; j++) {
                if (i == 0) {
                    read1[j] = Integer.parseInt((e[i][j].getText().toString()));
                }
                if (i == 1) {
                    read2[j] = Integer.parseInt((e[i][j].getText().toString()));
                }
            }
        }
        for (j=0;j<9;j++) {
            result[j]=read1[j]-read2[j];
        }
        Intent i1=new Intent(this,Mat.class);
        i1.putExtra("Extra",result);
        String n="Subtraction";
        i1.putExtra("which",n);
        startActivity(i1);
    }

    public void Multiplication(View view) {
        EditText e[][] = new EditText[2][9];
        int read1[] = new int[9];
        int read2[] = new int[9];
        int result[] = new int[9];

        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 9; j++) {
                String s = "T" + i + j;
                e[i][j] = findViewById((getResources().getIdentifier(s, "id", getPackageName())));
            }
        }
        for(i = 0; i< 2; i++){
            for (j = 0; j < 9; j++) {
                if (i == 0) {
                    read1[j] = Integer.parseInt((e[i][j].getText().toString()));
                }
                if (i == 1) {
                    read2[j] = Integer.parseInt((e[i][j].getText().toString()));
                }
            }
        }
        for (j=0;j<9;j++) {
            result[j]=read1[j]*read2[j];
        }
        Intent i1=new Intent(this,Mat.class);
        i1.putExtra("Extra",result);
        String n="Multiplication";
        i1.putExtra("which",n);
        startActivity(i1);
    }
}
