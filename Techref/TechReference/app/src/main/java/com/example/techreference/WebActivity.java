package com.example.techreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
    }

    public void wthree(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://www.w3schools.com/");
        startActivity(intent);
    }

    public void devdocs(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://devdocs.io/");
        startActivity(intent);
    }

    public void freecode(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://www.freecodecamp.org/news/");
        startActivity(intent);
    }

    public void mdn(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://developer.mozilla.org/en-US/docs/Web/Reference");
        startActivity(intent);
    }


    public void codrops(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://tympanus.net/codrops/css_reference/");
        startActivity(intent);
    }

    public void stack(View view) {
        Intent intent = new Intent(WebActivity.this,Web.class);
        intent.putExtra("address","https://stackoverflow.com/");
        startActivity(intent);
    }
}