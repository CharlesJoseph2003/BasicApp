package com.example.basicapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button MakeitRain;
    private TextView moneyValue;
    private Button ShowInfo;
    private int moneyCounter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeitRain = findViewById(R.id.buttonMakeitRain);
        moneyValue = findViewById(R.id.moneyValue);

        //MakeitRain.setOnClickListener(view -> Log.d("MainActivity", "onClick: Make it Rain "));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void showMoney(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter +=1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
        Log.d("MIR", "onClick:" +moneyCounter);
    }
}