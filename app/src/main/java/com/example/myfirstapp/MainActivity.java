package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Martin");
    }
    public void onButtonClicked2(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView2);
        myTextView.setText("Spinelli");
    }
}