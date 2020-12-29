package com.kemalcanceylan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    class Order implements Serializable {
//        int quantity;
//        String type;
//
//        public int getQuantity() {
//            return quantity;
//        }
//
//        public void setQuantity(int quantity) {
//            this.quantity = quantity;
//        }
//
//        public String getType() {
//            return type;
//        }
//
//        public void setType(String type) {
//            this.type = type;
//        }
//
//        Order(String foodType, int foodQuantity){
//            quantity = foodQuantity;
//            type = foodType;
//        }
//    }

//    ArrayList<Order> list = new ArrayList<Order>();

    ArrayList<Integer> quantities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMenu(View view){
        addItems();
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);

//        intent.putExtra("list", list);
        intent.putExtra("quantities", quantities);
        startActivity(intent);

    }

    public void addItems(){
        //Pizza
//        list.add(new Order("Margarita", 0));
//        list.add(new Order("Milano", 0));
//        list.add(new Order("Akdeniz", 0));
//        list.add(new Order("Mixed", 0));
        quantities.add(0);//0
        quantities.add(0);//1
        quantities.add(0);//2
        quantities.add(0);//3
        //Pasta
//        list.add(new Order("Spaghetti", 0));
//        list.add(new Order("Orzo", 0));
//        list.add(new Order("Fettucine", 0));
//        list.add(new Order("Fusulli", 0));
        quantities.add(0);//4
        quantities.add(0);//5
        quantities.add(0);//6
        quantities.add(0);//7
        //Salad
//        list.add(new Order("Green Salad", 0));
//        list.add(new Order("Tuna Salad", 0));
//        list.add(new Order("Fruit Salad", 0));
//        list.add(new Order("Chicken Salad", 0));
        quantities.add(0);//8
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        //Meat
//        list.add(new Order("Bacon", 0));
//        list.add(new Order("Beef", 0));
//        list.add(new Order("Napolitana", 0));
//        list.add(new Order("Kebab", 0));
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        //Drink
//        list.add(new Order("Cola", 0));
//        list.add(new Order("Soda", 0));
//        list.add(new Order("Water", 0));
//        list.add(new Order("Milkshake", 0));
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        //Dessert
//        list.add(new Order("Cupcake", 0));
//        list.add(new Order("Cheesecake", 0));
//        list.add(new Order("Cookies", 0));
//        list.add(new Order("Applepie", 0));
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
        quantities.add(0);
    }

}
