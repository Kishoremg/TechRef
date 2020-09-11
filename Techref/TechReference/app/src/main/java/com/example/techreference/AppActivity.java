package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
    }

    public void tutpt(View view) {
        Intent intent = new Intent(AppActivity.this,Web.class);
        intent.putExtra("address","https://www.tutorialspoint.com/android/index.htm");
        startActivity(intent);
    }

    public void javat(View view) {
        Intent intent = new Intent(AppActivity.this,Web.class);
        intent.putExtra("address","https://www.javatpoint.com/android-tutorial");
        startActivity(intent);
    }

    public void edureka(View view) {
        Intent intent = new Intent(AppActivity.this,Web.class);
        intent.putExtra("address","https://www.edureka.co/blog/android-tutorial/");
        startActivity(intent);
    }

    public void android(View view) {
        Intent intent = new Intent(AppActivity.this,Web.class);
        intent.putExtra("address","https://developer.android.com/docs");
        startActivity(intent);
    }
}