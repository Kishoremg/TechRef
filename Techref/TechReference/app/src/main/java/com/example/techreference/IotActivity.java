package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iot);
    }

    public void tutpt(View view) {
        Intent intent = new Intent(IotActivity.this,Web.class);
        intent.putExtra("address","https://www.tutorialspoint.com/internet_of_things/index.htm");
        startActivity(intent);
    }

    public void javat(View view) {
        Intent intent = new Intent(IotActivity.this,Web.class);
        intent.putExtra("address","https://www.javatpoint.com/iot-internet-of-things");
        startActivity(intent);
    }

    public void edureka(View view) {
        Intent intent = new Intent(IotActivity.this,Web.class);
        intent.putExtra("address","https://www.edureka.co/blog/iot-tutorial/");
        startActivity(intent);
    }

    public void tone(View view) {
        Intent intent = new Intent(IotActivity.this,Web.class);
        intent.putExtra("address","https://tutorials.one/internet-of-things/");
        startActivity(intent);
    }
}