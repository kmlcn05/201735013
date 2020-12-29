package com.kemalcanceylan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

//    ArrayList<Order> list = new ArrayList<Order>();
    ArrayList<Integer> quantities = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent i = getIntent();
//        list = (ArrayList<Order>) i.getSerializableExtra("list");
        quantities = getIntent().getIntegerArrayListExtra("quantities");


    }

    public void btnPizza(View view) {
        String btnActivityIntent = "Pizza";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }
    public void btnPasta(View view) {
        String btnActivityIntent = "Pasta";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }
    public void btnSalad(View view) {
        String btnActivityIntent = "Salad";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }
    public void btnMeat(View view) {
        String btnActivityIntent = "Meat";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }
    public void btnDrinks(View view) {
        String btnActivityIntent = "Drinks";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }
    public void btnDessert(View view) {
        String btnActivityIntent = "Dessert";
        Intent intent = new Intent(MenuActivity.this, FoodDetailActivity.class);
        intent.putExtra("quantities", quantities);
        intent.putExtra("btnActivityIntent", btnActivityIntent);
        startActivity(intent);
    }

    public void btnBasket(View view){
        Intent intent = new Intent(MenuActivity.this, BasketActivity.class);
        intent.putExtra("quantities", quantities);
        startActivity(intent);
    }

}
