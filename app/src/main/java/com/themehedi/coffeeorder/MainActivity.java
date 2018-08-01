package com.themehedi.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incqnt(View view){

        quantity = quantity+1;
        display(quantity);
    }


    public void decqnt(View view) {

        quantity = quantity-1;

        if(quantity<0){

            quantity = 0;
            display(quantity);
        }

        else{

            display(quantity);
        }
    }



    public void submitOrder(View view){

        displayPrice(quantity*5);

    }



    private void display(int number){
        TextView quantity_text=(TextView) findViewById(R.id.quantity);
        quantity_text.setText(""+number);

    }

    private void displayPrice(int number){

        TextView priceView=(TextView) findViewById(R.id.price);
        priceView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    public void resetValue(View view) {
        display(0);
        displayPrice(0);
    }
}
