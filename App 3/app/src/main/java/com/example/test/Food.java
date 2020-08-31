package com.example.test;

import android.widget.EditText;

public class Food{
    public String foodName;
    public String foodId;
    public String foodValue;

    public Food(String foodName, String foodId, String foodValue){
        this.foodName = foodName;
        this.foodId = foodId;
        this.foodValue = foodValue;
    }
    public String getFoodId() {
        return foodId;
    }
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    public String getFoodValue() {
        return foodValue;
    }
    public void setFoodValue(String foodValue) {
        this.foodValue = foodValue;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
