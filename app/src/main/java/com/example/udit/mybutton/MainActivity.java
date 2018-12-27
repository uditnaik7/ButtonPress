package com.example.udit.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button = findViewById(R.id.btn);
        button = findViewById(R.id.btn2);

        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("TEST","CLICKED");
        }
    });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TEST" , "BTN 2 CLICKED ")
            }
        });

    }
}
