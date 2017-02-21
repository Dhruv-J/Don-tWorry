package com.example.dhruvjain1.dontworry;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ListView;
import android.view.Menu;
import android.support.v4.widget.SimpleCursorAdapter;
import android.database.Cursor;
import android.database.MatrixCursor;

public class MainActivity extends AppCompatActivity {

    SmsManager txt3 = SmsManager.getDefault();
    SmsManager txt4 = SmsManager.getDefault();
    SmsManager txt5 = SmsManager.getDefault();

    //SimpleCursorAdapter mAdapter;
    //MatrixCursor mMatrixCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*---------CONTACT RECEIVING CODE STARTS HERE---------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMatrixCursor = new MatrixCursor(new String[] {"_id", "name", "photo", "details"} );

        mAdapter = new SimpleCursorAdapter();
        ----------CONTACT RECEIVING CODE ENDS HERE----------*/




        /*--------------BUTTON CODE STARTS HERE--------------*/

        Button Button_1 = (Button) findViewById(R.id.Button_1);
        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager txt1 = SmsManager.getDefault();
                final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                final String phoneNo = phoneNumber.getText().toString();
                //String Msg1 = getIntent().getStringExtra("msg1");
                String sms = "asdf";
                txt1.sendTextMessage(phoneNo, null, sms, null, null);
            }
        });

        Button Button_2 = (Button) findViewById(R.id.Button_2);
        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager txt2 = SmsManager.getDefault();
                final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                final String phoneNo = phoneNumber.getText().toString();
                txt2.sendTextMessage(phoneNo, null, "This is a test #2", null, null);
            }
        });

        Button Button_3 = (Button) findViewById(R.id.Button_3);
        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                final String phoneNo = phoneNumber.getText().toString();
                txt3.sendTextMessage(phoneNo, null, "This is a test #3", null, null);
            }
        });

        Button Button_4 = (Button) findViewById(R.id.Button_4);
        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                final String phoneNo = phoneNumber.getText().toString();
                txt4.sendTextMessage(phoneNo, null, "This is a test #4", null, null);
            }
        });

        Button Button_5 = (Button) findViewById(R.id.Button_5);
        Button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                final String phoneNo = phoneNumber.getText().toString();
                txt5.sendTextMessage(phoneNo, null, "This is a test #5", null, null);
            }
        });
        /*--------------BUTTON CODE ENDS HERE-----------------*/
    }

}
