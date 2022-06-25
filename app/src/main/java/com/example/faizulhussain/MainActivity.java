package com.example.faizulhussain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 public int counter = 0;
 public TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Count_clicked(View view) {
        counter++;
        txt =(TextView) findViewById(R.id.textView);
        txt.setText(Integer.toString(counter));

    }

    public void Toast_clicked(View view) {
        counter=0;
        txt.setText(Integer.toString(counter));

    }
}