package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView prosesnya;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        prosesnya = findViewById(R.id.texthasil);

        Intent intent = getIntent();

        int data = intent.getIntExtra("key", 0);

        prosesnya.setText(Integer.toString(data));
    }

}