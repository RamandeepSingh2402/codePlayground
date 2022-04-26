package com.example.horizontalscrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button= findViewById(R.id.button);
         Log.d("General", "This app is working properly.");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "The button has been clicked.", Toast.LENGTH_SHORT).show();
                Log.d("Raman","This button is working properly.");
            }
        });
    }
}