package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view){
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str = input1.getText().toString();
        String str2 = input2.getText().toString();
        int sum = Integer.parseInt(str) + Integer.parseInt(str2);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",Integer.toString(sum));
        startActivity(intent);
    }
    public void sub(View view){
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str = input1.getText().toString();
        String str2 = input2.getText().toString();
        int result = Integer.parseInt(str) - Integer.parseInt(str2);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",Integer.toString(result));
        startActivity(intent);
    }
    public void mult(View view){
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str = input1.getText().toString();
        String str2 = input2.getText().toString();
        int result = Integer.parseInt(str) * Integer.parseInt(str2);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",Integer.toString(result));
        startActivity(intent);
    }
    public void div(View view){
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        String str = input1.getText().toString();
        String str2 = input2.getText().toString();
        int result = Integer.parseInt(str) / Integer.parseInt(str2);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",Integer.toString(result));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}