package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttoncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoncall = findViewById(R.id.btncall);

        buttoncall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:987654321"));
            startActivity(intent);


        });
        buttoncall = findViewById(R.id.btn1call);

        buttoncall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:9786656412"));
            startActivity(intent);
        } );


        buttoncall = findViewById(R.id.btn2call);

        buttoncall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:9706600012"));
            startActivity(intent);
        } );

        buttoncall = findViewById(R.id.btn3call);

        buttoncall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:9706600012"));
            startActivity(intent);
        } );






    }
}