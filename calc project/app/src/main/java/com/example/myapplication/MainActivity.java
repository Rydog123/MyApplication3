package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);

        final Button button0 = findViewById(R.id.button24);
        final Button button1 = findViewById(R.id.button21);
        final Button button2 = findViewById(R.id.button21);
        final Button button3 = findViewById(R.id.button19);
        final Button button4 = findViewById(R.id.button17);
        final Button button5 = findViewById(R.id.button16);
        final Button button6 = findViewById(R.id.button15);
        final Button button7 = findViewById(R.id.button13);
        final Button button8 = findViewById(R.id.button12);
        final Button button9 = findViewById(R.id.button11);


        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                textView.setText("9");
            }
        });

    }
}
