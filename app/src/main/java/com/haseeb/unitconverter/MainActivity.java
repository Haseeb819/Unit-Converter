package com.haseeb.unitconverter;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button,button2,button3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
    }
    @SuppressLint("SetTextI18n")
    public void calculate(View view){
        String s = editText.getText().toString();
        float kg = Float.parseFloat(s);
        float pound = (float) (2.205 * kg);

        textView.setText("Value in pound is "+pound);
    }
    @SuppressLint("SetTextI18n")
    public void cal2(View view){
        String s = editText.getText().toString();
        float kg = Float.parseFloat(s);
        float g = (float) (1000 * kg);

        textView.setText("Value in gram is "+g);
    }
    @SuppressLint("SetTextI18n")
    public void cal3(View view){
        String s = editText.getText().toString();
        float kg = Float.parseFloat(s);
        float t = (float) (kg / 1000);

        textView.setText("Value in tonne is "+t);
    }
}