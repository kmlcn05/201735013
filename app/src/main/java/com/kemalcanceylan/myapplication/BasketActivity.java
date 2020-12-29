package com.kemalcanceylan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class BasketActivity extends AppCompatActivity {
    TextView tvItemQuantity1, tvItemQuantity2, tvItemQuantity3, tvItemQuantity4, tvItemQuantity5, tvItemQuantity6, tvItemQuantity7, tvItemQuantity8, tvItemQuantity9, tvItemQuantity10, tvItemQuantity11, tvItemQuantity12, tvItemQuantity13,
            tvItemQuantity14, tvItemQuantity15, tvItemQuantity16, tvItemQuantity17, tvItemQuantity18, tvItemQuantity19, tvItemQuantity20, tvItemQuantity21, tvItemQuantity22, tvItemQuantity23, tvItemQuantity24;
    TextView tvItemQuantity1price, tvItemQuantity2price, tvItemQuantity3price, tvItemQuantity4price, tvItemQuantity5price, tvItemQuantity6price, tvItemQuantity7price, tvItemQuantity8price, tvItemQuantity9price, tvItemQuantity10price,
            tvItemQuantity11price, tvItemQuantity12price, tvItemQuantity13price, tvItemQuantity14price, tvItemQuantity15price, tvItemQuantity16price, tvItemQuantity17price, tvItemQuantity18price, tvItemQuantity19price, tvItemQuantity20price,
            tvItemQuantity21price, tvItemQuantity22price, tvItemQuantity23price, tvItemQuantity24price;
    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15,
            linearLayout16, linearLayout17, linearLayout18, linearLayout19, linearLayout20, linearLayout21, linearLayout22, linearLayout23, linearLayout24;

    ArrayList<Integer> quantities = new ArrayList<>();
    Integer check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        Button b = (Button) findViewById(R.id.button11);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasketActivity.this,Order.class));
                Intent intent = new Intent(getBaseContext(), Order.class);
                intent.putExtra("Total_Check", check);
                startActivity(intent);
            }
        });



        quantities = getIntent().getIntegerArrayListExtra("quantities");


        tvItemQuantity1 = findViewById(R.id.tvItemQuantity1);
        linearLayout1 = findViewById(R.id.linearLayout1);
        tvItemQuantity1price = findViewById(R.id.tvItemQuantity1price);
        tvItemQuantity2 = findViewById(R.id.tvItemQuantity2);
        linearLayout2 = findViewById(R.id.linearLayout2);
        tvItemQuantity2price = findViewById(R.id.tvItemQuantity2price);
        tvItemQuantity3 = findViewById(R.id.tvItemQuantity3);
        linearLayout3 = findViewById(R.id.linearLayout3);
        tvItemQuantity3price = findViewById(R.id.tvItemQuantity3price);
        tvItemQuantity4 = findViewById(R.id.tvItemQuantity4);
        linearLayout4 = findViewById(R.id.linearLayout4);
        tvItemQuantity4price = findViewById(R.id.tvItemQuantity4price);
        tvItemQuantity5 = findViewById(R.id.tvItemQuantity5);
        linearLayout5 = findViewById(R.id.linearLayout5);
        tvItemQuantity5price = findViewById(R.id.tvItemQuantity5price);
        tvItemQuantity6 = findViewById(R.id.tvItemQuantity6);
        linearLayout6 = findViewById(R.id.linearLayout6);
        tvItemQuantity6price = findViewById(R.id.tvItemQuantity6price);
        tvItemQuantity7 = findViewById(R.id.tvItemQuantity7);
        linearLayout7 = findViewById(R.id.linearLayout7);
        tvItemQuantity7price = findViewById(R.id.tvItemQuantity7price);
        tvItemQuantity8 = findViewById(R.id.tvItemQuantity8);
        linearLayout8 = findViewById(R.id.linearLayout8);
        tvItemQuantity8price = findViewById(R.id.tvItemQuantity8price);
        tvItemQuantity9 = findViewById(R.id.tvItemQuantity9);
        linearLayout9 = findViewById(R.id.linearLayout9);
        tvItemQuantity9price = findViewById(R.id.tvItemQuantity9price);
        tvItemQuantity10 = findViewById(R.id.tvItemQuantity10);
        linearLayout10 = findViewById(R.id.linearLayout10);
        tvItemQuantity10price = findViewById(R.id.tvItemQuantity10price);
        tvItemQuantity11 = findViewById(R.id.tvItemQuantity11);
        linearLayout11 = findViewById(R.id.linearLayout11);
        tvItemQuantity11price = findViewById(R.id.tvItemQuantity11price);
        tvItemQuantity12 = findViewById(R.id.tvItemQuantity12);
        linearLayout12 = findViewById(R.id.linearLayout12);
        tvItemQuantity12price = findViewById(R.id.tvItemQuantity12price);
        tvItemQuantity13 = findViewById(R.id.tvItemQuantity13);
        linearLayout13 = findViewById(R.id.linearLayout13);
        tvItemQuantity13price = findViewById(R.id.tvItemQuantity13price);
        tvItemQuantity14 = findViewById(R.id.tvItemQuantity14);
        linearLayout14 = findViewById(R.id.linearLayout14);
        tvItemQuantity14price = findViewById(R.id.tvItemQuantity14price);
        tvItemQuantity15 = findViewById(R.id.tvItemQuantity15);
        linearLayout15 = findViewById(R.id.linearLayout15);
        tvItemQuantity15price = findViewById(R.id.tvItemQuantity15price);
        tvItemQuantity16 = findViewById(R.id.tvItemQuantity16);
        linearLayout16 = findViewById(R.id.linearLayout16);
        tvItemQuantity16price = findViewById(R.id.tvItemQuantity16price);
        tvItemQuantity17 = findViewById(R.id.tvItemQuantity17);
        linearLayout17 = findViewById(R.id.linearLayout17);
        tvItemQuantity17price = findViewById(R.id.tvItemQuantity17price);
        tvItemQuantity18 = findViewById(R.id.tvItemQuantity18);
        linearLayout18 = findViewById(R.id.linearLayout18);
        tvItemQuantity18price = findViewById(R.id.tvItemQuantity18price);
        tvItemQuantity19 = findViewById(R.id.tvItemQuantity19);
        linearLayout19 = findViewById(R.id.linearLayout19);
        tvItemQuantity19price = findViewById(R.id.tvItemQuantity19price);
        tvItemQuantity20 = findViewById(R.id.tvItemQuantity20);
        linearLayout20 = findViewById(R.id.linearLayout20);
        tvItemQuantity20price = findViewById(R.id.tvItemQuantity20price);
        tvItemQuantity21 = findViewById(R.id.tvItemQuantity21);
        linearLayout21 = findViewById(R.id.linearLayout21);
        tvItemQuantity21price = findViewById(R.id.tvItemQuantity21price);
        tvItemQuantity22 = findViewById(R.id.tvItemQuantity22);
        linearLayout22 = findViewById(R.id.linearLayout22);
        tvItemQuantity22price = findViewById(R.id.tvItemQuantity22price);
        tvItemQuantity23 = findViewById(R.id.tvItemQuantity23);
        linearLayout23 = findViewById(R.id.linearLayout23);
        tvItemQuantity23price = findViewById(R.id.tvItemQuantity23price);
        tvItemQuantity24 = findViewById(R.id.tvItemQuantity24);
        linearLayout24 = findViewById(R.id.linearLayout24);
        tvItemQuantity24price = findViewById(R.id.tvItemQuantity24price);


        setItemQuantities();

    }

    public void setItemQuantities() {

        if (quantities.get(0)!= 0) {
            linearLayout1.setVisibility(View.VISIBLE);
            tvItemQuantity1.setText(String.valueOf(quantities.get(0)));
            tvItemQuantity1price.setText(String.valueOf(quantities.get(0) * 16) +" € ");
            check = check + quantities.get(0) * 16;
        }


        if (quantities.get(1)!= 0){
            linearLayout2.setVisibility(View.VISIBLE);
            tvItemQuantity2.setText(String.valueOf(quantities.get(1)));
            tvItemQuantity2price.setText(String.valueOf(quantities.get(1) * 18) +" € ");
            check = check + quantities.get(1) * 18;
        }


        if (quantities.get(2)!= 0){
            linearLayout3.setVisibility(View.VISIBLE);
            tvItemQuantity3.setText(String.valueOf(quantities.get(2)));
            tvItemQuantity3price.setText(String.valueOf(quantities.get(2) * 20) +" € ");
            check = check + quantities.get(2) * 20;
        }


        if (quantities.get(3)!= 0) {
            linearLayout4.setVisibility(View.VISIBLE);
            tvItemQuantity4.setText(String.valueOf(quantities.get(3)));
            tvItemQuantity4price.setText(String.valueOf(quantities.get(3) * 22) +" € ");
            check = check + quantities.get(3) * 22;
        }


        if (quantities.get(4)!= 0) {
            linearLayout5.setVisibility(View.VISIBLE);
            tvItemQuantity5.setText(String.valueOf(quantities.get(4)));
            tvItemQuantity5price.setText(String.valueOf(quantities.get(4) * 11) +" € ");
            check = check + quantities.get(4) * 11;
        }


        if (quantities.get(5)!= 0) {
            linearLayout6.setVisibility(View.VISIBLE);
            tvItemQuantity6.setText(String.valueOf(quantities.get(5)));
            tvItemQuantity6price.setText(String.valueOf(quantities.get(5) * 13) +" € ");
            check = check + quantities.get(5) * 13;
        }


        if (quantities.get(6)!= 0) {
            linearLayout7.setVisibility(View.VISIBLE);
            tvItemQuantity7.setText(String.valueOf(quantities.get(6)));
            tvItemQuantity7price.setText(String.valueOf(quantities.get(6) * 17) +" € ");
            check = check + quantities.get(6) * 17;
        }


        if (quantities.get(7)!= 0) {
            linearLayout8.setVisibility(View.VISIBLE);
            tvItemQuantity8.setText(String.valueOf(quantities.get(7)));
            tvItemQuantity8price.setText(String.valueOf(quantities.get(7) * 21) +" € ");
            check = check + quantities.get(7) * 21;
        }


        if (quantities.get(8)!= 0) {
            linearLayout9.setVisibility(View.VISIBLE);
            tvItemQuantity9.setText(String.valueOf(quantities.get(8)));
            tvItemQuantity9price.setText(String.valueOf(quantities.get(8) * 13) +" € ");
            check = check + quantities.get(8) * 13;
        }


        if (quantities.get(9)!= 0) {
            linearLayout10.setVisibility(View.VISIBLE);
            tvItemQuantity10.setText(String.valueOf(quantities.get(9)));
            tvItemQuantity10price.setText(String.valueOf(quantities.get(9) * 14) +" € ");
            check = check + quantities.get(9) * 14;
        }


        if (quantities.get(10)!= 0) {
            linearLayout11.setVisibility(View.VISIBLE);
            tvItemQuantity11.setText(String.valueOf(quantities.get(10)));
            tvItemQuantity11price.setText(String.valueOf(quantities.get(10) * 15) +" € ");
            check = check + quantities.get(10) * 15;
        }


        if (quantities.get(11)!= 0) {
            linearLayout12.setVisibility(View.VISIBLE);
            tvItemQuantity12.setText(String.valueOf(quantities.get(11)));
            tvItemQuantity12price.setText(String.valueOf(quantities.get(11) * 16) +" € ");
            check = check + quantities.get(11) * 16;
        }

        if (quantities.get(12)!= 0) {
            linearLayout13.setVisibility(View.VISIBLE);
            tvItemQuantity13.setText(String.valueOf(quantities.get(12)));
            tvItemQuantity13price.setText(String.valueOf(quantities.get(12) * 30) +" € ");
            check = check + quantities.get(12) * 30;
        }


        if (quantities.get(13)!= 0) {
            linearLayout14.setVisibility(View.VISIBLE);
            tvItemQuantity14.setText(String.valueOf(quantities.get(13)));
            tvItemQuantity14price.setText(String.valueOf(quantities.get(13) * 28) +" € ");
            check = check + quantities.get(13) * 28;
        }


        if (quantities.get(14)!= 0) {
            linearLayout15.setVisibility(View.VISIBLE);
            tvItemQuantity15.setText(String.valueOf(quantities.get(14)));
            tvItemQuantity15price.setText(String.valueOf(quantities.get(14) * 33) +" € ");
            check = check + quantities.get(14) * 33;
        }


        if (quantities.get(15)!= 0) {
            linearLayout16.setVisibility(View.VISIBLE);
            tvItemQuantity16.setText(String.valueOf(quantities.get(15)));
            tvItemQuantity16price.setText(String.valueOf(quantities.get(15) * 25) +" € ");
            check = check + quantities.get(15) * 25;
        }


        if (quantities.get(16)!= 0) {
            linearLayout17.setVisibility(View.VISIBLE);
            tvItemQuantity17.setText(String.valueOf(quantities.get(16)));
            tvItemQuantity17price.setText(String.valueOf(quantities.get(16) * 2) +" € ");
            check = check + quantities.get(16) * 2;
        }


        if (quantities.get(17)!= 0) {
            linearLayout18.setVisibility(View.VISIBLE);
            tvItemQuantity18.setText(String.valueOf(quantities.get(17)));
            tvItemQuantity18price.setText(String.valueOf(quantities.get(17) * 1) +" € ");
            check = check + quantities.get(17) * 1;
        }


        if (quantities.get(18)!= 0) {
            linearLayout19.setVisibility(View.VISIBLE);
            tvItemQuantity19.setText(String.valueOf(quantities.get(18)));
            tvItemQuantity19price.setText(String.valueOf(quantities.get(18) * 1) +" € ");
            check = check + quantities.get(18) * 1;
        }


        if (quantities.get(19)!= 0) {
            linearLayout20.setVisibility(View.VISIBLE);
            tvItemQuantity20.setText(String.valueOf(quantities.get(19)));
            tvItemQuantity20price.setText(String.valueOf(quantities.get(19) * 4) +" € ");
            check = check + quantities.get(19) * 4;
        }


        if (quantities.get(20)!= 0) {
            linearLayout21.setVisibility(View.VISIBLE);
            tvItemQuantity21.setText(String.valueOf(quantities.get(20)));
            tvItemQuantity21price.setText(String.valueOf(quantities.get(20) * 9) +" € ");
            check = check + quantities.get(20) * 9;
        }


        if (quantities.get(21)!= 0) {
            linearLayout22.setVisibility(View.VISIBLE);
            tvItemQuantity22.setText(String.valueOf(quantities.get(21)));
            tvItemQuantity22price.setText(String.valueOf(quantities.get(21) * 11) +" € ");
            check = check + quantities.get(21) * 11;
        }


        if (quantities.get(22)!= 0) {
            linearLayout23.setVisibility(View.VISIBLE);
            tvItemQuantity23.setText(String.valueOf(quantities.get(22)));
            tvItemQuantity23price.setText(String.valueOf(quantities.get(22) * 6) +" € ");
            check = check + quantities.get(22) * 6;
        }


        if (quantities.get(23)!= 0) {
            linearLayout24.setVisibility(View.VISIBLE);
            tvItemQuantity24.setText(String.valueOf(quantities.get(23)));
            tvItemQuantity24price.setText(String.valueOf(quantities.get(23) * 5) +" € ");
            check = check + quantities.get(23) * 5;

        }



    }

}
