package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        edit2= findViewById(R.id.edit2);
        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());

                int sum = num1 +num2;

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key", sum);
                startActivity(intent);


            }
       })
    ;}
}




