package com.kemalcanceylan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {
    int quantity1 = 0, quantity2 = 0, quantity3 = 0, quantity4 = 0;
    TextView tvFood1, tvFood2, tvFood3, tvFood4;
    TextView tvFood1Price, tvFood2Price, tvFood3Price, tvFood4Price;
    TextView tvQuantity1, tvQuantity2, tvQuantity3, tvQuantity4;
//    ArrayList<MainActivity.Order> list = new ArrayList<MainActivity.Order>();
    ArrayList<Integer> quantities = new ArrayList<>();
    String activityType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        activityType = getIntent().getStringExtra("btnActivityIntent");

        //Textview Set
        tvFood1 = findViewById(R.id.tvFood1);
        tvFood2 = findViewById(R.id.tvFood2);
        tvFood3 = findViewById(R.id.tvFood3);
        tvFood4 = findViewById(R.id.tvFood4);
        tvFood1Price = findViewById(R.id.tvFood1Price);
        tvFood2Price = findViewById(R.id.tvFood2Price);
        tvFood3Price = findViewById(R.id.tvFood3Price);
        tvFood4Price = findViewById(R.id.tvFood4Price);
        tvQuantity1 = findViewById(R.id.tvQuantity1);
        tvQuantity2 = findViewById(R.id.tvQuantity2);
        tvQuantity3 = findViewById(R.id.tvQuantity3);
        tvQuantity4 = findViewById(R.id.tvQuantity4);

        setFoodTypes(activityType);

    }

    public void setFoodTypes(String activityType) {
        switch (activityType) {
            case "Pizza":
                tvFood1.setText("Margarita");
                tvFood1Price.setText("16€");
                tvFood2.setText("Milano");
                tvFood2Price.setText("18€");
                tvFood3.setText("Akdeniz");
                tvFood3Price.setText("20€");
                tvFood4.setText("Mixed");
                tvFood4Price.setText("22€");

                break;
            case "Pasta":
                tvFood1.setText("Spaghetti");
                tvFood1Price.setText("11€");
                tvFood2.setText("Orzo");
                tvFood2Price.setText("13€");
                tvFood3.setText("Fettucine");
                tvFood3Price.setText("17€");
                tvFood4.setText("Fusulli");
                tvFood4Price.setText("21€");
                break;
            case "Salad":
                tvFood1.setText("Green Salad");
                tvFood1Price.setText("13€");
                tvFood2.setText("Tuna Salad");
                tvFood2Price.setText("14€");
                tvFood3.setText("Fruit Salad");
                tvFood3Price.setText("15€");
                tvFood4.setText("Chicken Salad");
                tvFood4Price.setText("16€");
                break;
            case "Meat":
                tvFood1.setText("Bacon");
                tvFood1Price.setText("30€");
                tvFood2.setText("Beef");
                tvFood2Price.setText("28€");
                tvFood3.setText("Napolitana");
                tvFood3Price.setText("33€");
                tvFood4.setText("Kebab");
                tvFood4Price.setText("25€");
                break;
            case "Drinks":
                tvFood1.setText("Cola");
                tvFood1Price.setText("2€");
                tvFood2.setText("Soda");
                tvFood2Price.setText("1€");
                tvFood3.setText("Water");
                tvFood3Price.setText("1€");
                tvFood4.setText("Milkshake");
                tvFood4Price.setText("4€");
                break;
            case "Dessert":
                tvFood1.setText("Cupcake");
                tvFood1Price.setText("9€");
                tvFood2.setText("Cheesecake");
                tvFood2Price.setText("11€");
                tvFood3.setText("Cookies");
                tvFood3Price.setText("6€");
                tvFood4.setText("Applepie");
                tvFood4Price.setText("5€");
                break;
        }
    }

    public void btnAdd1(View view) {
//        activityType = getIntent().getStringExtra("btnActivityIntent");
        quantity1++;
        if (activityType.equals("Pizza")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(0, quantity1);
        } else if (activityType.equals("Pasta")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(4, quantity1);
        } else if (activityType.equals("Salad")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(8, quantity1);
        } else if (activityType.equals("Meat")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(12, quantity1);
        } else if (activityType.equals("Drinks")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(16, quantity1);
        } else {
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(20, quantity1);
        }
        tvQuantity1.setText(String.valueOf(quantity1));
    }

    public void btnAdd2(View view) {
        quantity2++;
        if (activityType.equals("Pizza")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(1, quantity2);
        } else if (activityType.equals("Pasta")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(5, quantity2);
        } else if (activityType.equals("Salad")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(9, quantity2);
        } else if (activityType.equals("Meat")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(13, quantity2);
        } else if (activityType.equals("Drinks")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(17, quantity2);
        } else {
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(21, quantity2);
        }
        tvQuantity2.setText(String.valueOf(quantity2));
    }

    public void btnAdd3(View view) {
        quantity3++;
        if (activityType.equals("Pizza")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(2, quantity3);
        } else if (activityType.equals("Pasta")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(6, quantity3);
        } else if (activityType.equals("Salad")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(10, quantity3);
        } else if (activityType.equals("Meat")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(14, quantity3);
        } else if (activityType.equals("Drinks")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(18, quantity3);
        } else {
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(22, quantity3);
        }
        tvQuantity3.setText(String.valueOf(quantity3));
    }

    public void btnAdd4(View view) {
        quantity4++;
        if (activityType.equals("Pizza")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(3, quantity4);
        } else if (activityType.equals("Pasta")){
            quantities = getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(7, quantity4);
        } else if (activityType.equals("Salad")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(11, quantity4);
        } else if (activityType.equals("Meat")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(15, quantity4);
        } else if (activityType.equals("Drinks")){
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(19, quantity4);
        } else {
            quantities =getIntent().getIntegerArrayListExtra("quantities");
            quantities.set(23, quantity4);
        }
        tvQuantity4.setText(String.valueOf(quantity4));
    }

    public void btnAddtoBasket(View view){
        Intent intent = new Intent(FoodDetailActivity.this, MenuActivity.class);
        intent.putExtra("quantities", quantities);
        startActivity(intent);
    }
}
