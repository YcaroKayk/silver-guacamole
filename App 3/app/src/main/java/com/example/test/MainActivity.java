//Alunos:
//  Ycaro Kayk Fernandes Ferreira dos Santos.
//  Guilherme Neves Canedo.

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
    ListView listView;
    Button saveButton,listButton;
    EditText foodName,foodId,foodValue;
    Food newFood;
    String auxName,auxId,auxValue;
    foodAdapter adapter;
    ArrayList<Food> ArrayOfFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menulayout);

        listView = (ListView) findViewById(R.id.listTest);
        saveButton = (Button) findViewById(R.id.saveFoodButton);
        listButton = (Button) findViewById(R.id.listFoodButton);
        foodName = (EditText) findViewById(R.id.editFoodName);
        foodId = (EditText) findViewById(R.id.editFoodId);
        foodValue = (EditText) findViewById(R.id.editFoodValue);

        ArrayOfFoods = new ArrayList<Food>();
        adapter = new foodAdapter(this,ArrayOfFoods);

        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               auxName = foodName.getText().toString();
               auxId = foodId.getText().toString();
               auxValue = foodValue.getText().toString();
               newFood = new Food(auxName,auxId,auxValue);
               adapter.add(newFood);
            }
        });
        listView.setAdapter(adapter);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.foodmenu);
            }
        });
    }
}
