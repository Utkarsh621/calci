package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        EditText edt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText edt2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        TextView txt = (TextView) findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int c = a + b;
                String result = "Result is: " + c;
                txt.setText(result);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int c = a - b;
                String result = "Result is: " + c;
                txt.setText(result);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int c = a * b;
                String result = "Result is: " + c;
                txt.setText(result);

            }
        });

    }
}