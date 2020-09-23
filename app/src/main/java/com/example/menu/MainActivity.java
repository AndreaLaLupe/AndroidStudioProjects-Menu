package com.example.menu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView tex=(TextView) findViewById(R.id.menu_item_1);
        String menu=tex.getText().toString();
        Log.d("MainActivity", menu);
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}
