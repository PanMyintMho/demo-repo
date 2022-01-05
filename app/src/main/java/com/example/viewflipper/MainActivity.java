package com.example.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper vflipper;
    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vflipper=findViewById(R.id.vflipper);
        btnone=findViewById(R.id.btnone);
        btntwo=findViewById(R.id.btntwo);
        btnthree=findViewById(R.id.btnthree);
        btnfour=findViewById(R.id.btnfour);
        btnfive=findViewById(R.id.btnfive);
        btnsix=findViewById(R.id.btnsix);
        btnseven=findViewById(R.id.btnseven);
//        vflipper.setFlipInterval(2000);
//        vflipper.startFlipping();
        vflipper.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        vflipper.showNext();
    }
}