package com.example.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button jupiterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        jupiterButton = (Button) findViewById(R.id.jupiterButton);

        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
    }

    public void openActivity7() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);

    }
}