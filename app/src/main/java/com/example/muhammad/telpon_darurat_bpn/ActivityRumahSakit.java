package com.example.muhammad.telpon_darurat_bpn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityRumahSakit extends AppCompatActivity {

    Button tombol1,tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_sakit);

        tombol1 = (Button)findViewById(R.id.button1);
        tombol2 = (Button)findViewById(R.id.button2);
        tombol3 = (Button)findViewById(R.id.button3);
        tombol4 = (Button)findViewById(R.id.button4);
        tombol5 = (Button)findViewById(R.id.button5);
        tombol6 = (Button)findViewById(R.id.button6);
        tombol7 = (Button)findViewById(R.id.button7);
        tombol8 = (Button)findViewById(R.id.button8);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:873901"));
                startActivity(intent);
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:423409"));
                startActivity(intent);
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7022246"));
                startActivity(intent);
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:427342"));
                startActivity(intent);
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:734020"));
                startActivity(intent);
            }
        });

        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8879939"));
                startActivity(intent);
            }
        });

        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:877330"));
                startActivity(intent);
            }
        });

        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:440048"));
                startActivity(intent);
            }
        });


    }
}
