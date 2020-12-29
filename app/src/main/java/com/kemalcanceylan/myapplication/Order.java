package com.kemalcanceylan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Order extends Activity {
    TextView textView5;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.orderwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager() .getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
        
        setTotalCheck();
    }
    public void setTotalCheck() {

        Integer totalcheck = getIntent().getIntExtra("Total_Check", 0);
        textView5 = findViewById(R.id.textView5);
        textView5.setText("Your order has been received,Price: "+ String.valueOf(totalcheck) +"€");

    }
}
