package com.example.muhammad.telpon_darurat_bpn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPemadam extends AppCompatActivity {

    Button tombol1, tombol2,tombol3, tombol4, tombol5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemadam);

        tombol1 = (Button)findViewById(R.id.button1);
        tombol2 = (Button)findViewById(R.id.button2);
        tombol3 = (Button)findViewById(R.id.button3);
        tombol4 = (Button)findViewById(R.id.button4);
        tombol5 = (Button)findViewById(R.id.button5);


        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7218199"));
                startActivity(intent);
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:421113"));
                startActivity(intent);
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:731606"));
                startActivity(intent);
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:878207"));
                startActivity(intent);
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:743337"));
                startActivity(intent);
            }
        });
    }
}
