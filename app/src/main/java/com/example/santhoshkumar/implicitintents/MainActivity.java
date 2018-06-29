package com.example.santhoshkumar.implicitintents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button call = (Button)findViewById(R.id.btn_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        Button dial = (Button)findViewById(R.id.btn_dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9487735306"));
                startActivity(intent);
            }
        });

        Button map = (Button)findViewById(R.id.btn_Map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q= salem, tamilnadu"));
                startActivity(intent);
            }
        });

        Button web = (Button)findViewById(R.id.btn_Web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
    }

}
