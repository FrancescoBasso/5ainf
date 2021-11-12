package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


 EditText editText;
 Button reset;
 Button test;
 Button play;
 TextView textView;
 private EditText mMessageEditText;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private Object Intent;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main);
        mMessageEditText = findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        reset=(Button) findViewById(R.id.reset);
        test= (Button) findViewById(R.id.test);
        play= (Button) findViewById(R.id.play);
         /*reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.getText().clear();
            }*/
        }

    public void Test(View v){
        //textView.setText(editText.getText().toString());
        Toast t = Toast.makeText(getApplicationContext(),"messaggio",Toast.LENGTH_LONG);
        t.show();
    }

    public void reset(View v) {

        editText.setText(" ");
    }

    public void launchSecondActivity(View v) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        /*String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/

    }

    /*public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        getIntent();
        intent intent
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }*/
}