package com.example.dhruvjain1.dontworry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class setMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_messages);

        TextView btn1setTxt = (TextView) findViewById(R.id.btn1setTxt);
        String msg1 = btn1setTxt.getText().toString();
        TextView btn2setTxt = (TextView) findViewById(R.id.btn2setTxt);
        String msg2 = btn2setTxt.getText().toString();
        TextView btn3setTxt = (TextView) findViewById(R.id.btn3setTxt);
        String msg3 = btn3setTxt.getText().toString();
        TextView btn4setTxt = (TextView) findViewById(R.id.btn4setTxt);
        String msg4 = btn4setTxt.getText().toString();
        TextView btn5setTxt = (TextView) findViewById(R.id.btn5setTxt);
        String msg5 = btn5setTxt.getText().toString();

        //Intent btn1txt = new Intent(getApplicationContext(), MainActivity.class);
        //btn1txt.putExtra(msg1, "msg1");
        //startActivity(btn1txt);
    }
}
