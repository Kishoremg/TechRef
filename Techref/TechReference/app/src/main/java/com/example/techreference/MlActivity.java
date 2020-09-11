package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ml);
    }

    public void edx(View view) {
        Intent intent = new Intent(MlActivity.this,Web.class);
        intent.putExtra("address","https://www.edx.org/learn/machine-learning");
        startActivity(intent);
    }

    public void wthree(View view) {
        Intent intent = new Intent(MlActivity.this,Web.class);
        intent.putExtra("address","https://www.w3schools.com/python/python_ml_getting_started.asp");
        startActivity(intent);
    }

    public void gfg(View view) {
        Intent intent = new Intent(MlActivity.this,Web.class);
        intent.putExtra("address","https://www.geeksforgeeks.org/machine-learning/");
        startActivity(intent);
    }

    public void hacker(View view) {
        Intent intent = new Intent(MlActivity.this,Web.class);
        intent.putExtra("address","https://www.hackerearth.com/blog/developers/13-free-training-courses-on-machine-learning-and-artificial-intelligence/");
        startActivity(intent);
    }
}