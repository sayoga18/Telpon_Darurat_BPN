package com.example.muhammad.telpon_darurat_bpn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityPolisi extends AppCompatActivity {
    Button tombol1, tombol2, tombol3, tombol4, tombol5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polisi);

        tombol1 = (Button) findViewById(R.id.button1);
        tombol2 = (Button) findViewById(R.id.button2);
        tombol3 = (Button) findViewById(R.id.button3);
        tombol4 = (Button) findViewById(R.id.button4);
        tombol5 = (Button) findViewById(R.id.button5);


    tombol1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5604000"));
            startActivity(intent);
        }
    });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:761400"));
                startActivity(intent);
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:422392"));
                startActivity(intent);
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5652707"));
                startActivity(intent);
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5616255"));
                startActivity(intent);
            }
        });
    }
}
