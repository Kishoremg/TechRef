package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eh);
    }

    public void javat(View view) {
        Intent intent = new Intent(EhActivity.this,Web.class);
        intent.putExtra("address","https://www.javatpoint.com/ethical-hacking-tutorial");
        startActivity(intent);
    }

    public void edureka(View view) {
        Intent intent = new Intent(EhActivity.this,Web.class);
        intent.putExtra("address","https://www.edureka.co/blog/ethical-hacking-tutorial/");
        startActivity(intent);
    }

    public void tutpt(View view) {
        Intent intent = new Intent(EhActivity.this,Web.class);
        intent.putExtra("address","https://www.tutorialspoint.com/ethical_hacking/index.htm");
        startActivity(intent);
    }

    public void wthree(View view) {
        Intent intent = new Intent(EhActivity.this,Web.class);
        intent.putExtra("address","https://www.w3schools.in/category/ethical-hacking/");
        startActivity(intent);
    }
}