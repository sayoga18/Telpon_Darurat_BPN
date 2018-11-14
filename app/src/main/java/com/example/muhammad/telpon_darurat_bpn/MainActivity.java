package com.example.muhammad.telpon_darurat_bpn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton tombol1,tombol2, tombol3,tombol4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1 = (ImageButton)findViewById(R.id.button1);
        tombol2 = (ImageButton)findViewById(R.id.button2);
        tombol3 = (ImageButton)findViewById(R.id.button3);
        tombol4 = (ImageButton)findViewById(R.id.button4);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityAkun.class);
                startActivity(intent);
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityRumahSakit.class);
                startActivity(intent);
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityPolisi.class);
                startActivity(intent);
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityPemadam.class);
                startActivity(intent);
            }
        });
    }
}
