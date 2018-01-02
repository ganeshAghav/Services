package com.everestit.services;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button btnstart,btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= (TextView) findViewById(R.id.result);
        btnstart= (Button) findViewById(R.id.btnstart);
        btnstop= (Button) findViewById(R.id.btnstop);

        // Method to start the service
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startService(new Intent(getBaseContext(), MyService.class));
                result.setText("Stated");
            }
        });

        // Method to stop the service
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(new Intent(getBaseContext(), MyService.class));
                result.setText("Stoped");
            }
        });
    }
}
