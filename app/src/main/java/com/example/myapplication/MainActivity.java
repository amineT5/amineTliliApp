package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textCount);

    }
    public void showToast(View view){
        Context context;
        Toast toast = Toast.makeText(context;:Object text;
        this, text;:"button Toast Clicked", Toast.LENGTH_SHORT;).toast.show();

    }
    public void countUp(View view) {
        ++mCount;
        boolean mShowcunt = false;
        if (mShowcunt != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}