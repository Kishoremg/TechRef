package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void refweb(View view) {
        startActivity(new Intent(StartActivity.this,WebActivity.class));
    }

    public void refapp(View view) {
        startActivity(new Intent(StartActivity.this, AppActivity.class));
    }

    public void refml(View view) {
        startActivity(new Intent(StartActivity.this,MlActivity.class));
    }


    public void refiot(View view) {
        startActivity(new Intent(StartActivity.this,IotActivity.class));
    }

    public void refeh(View view) {
        startActivity(new Intent(StartActivity.this,EhActivity.class));
    }


}