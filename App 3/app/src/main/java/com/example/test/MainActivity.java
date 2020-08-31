package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView = findViewById(R.id.listTest);
    Button saveButton = findViewById(R.id.saveFoodButton);
    Button listButton = findViewById(R.id.listFoodButton);
    EditText foodName = findViewById(R.id.editFoodName);
    EditText foodId = findViewById(R.id.editFoodId);
    EditText foodValue = findViewById(R.id.editFoodValue);
    Food newFood;
    String auxName,auxId,auxValue;
    ArrayList<Food> ArrayOfFoods = new ArrayList<Food>();
    foodAdapter adapter = new foodAdapter(this,ArrayOfFoods);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menulayout);
        listView.setAdapter(adapter);


        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               auxName = foodName.getText().toString();
               auxId = foodId.getText().toString();
               auxValue = foodValue.getText().toString();
               newFood= new Food(auxName,auxId,auxValue);
               adapter.add(newFood);
            }
        });
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.foodmenu);
            }
        });
    }
}
