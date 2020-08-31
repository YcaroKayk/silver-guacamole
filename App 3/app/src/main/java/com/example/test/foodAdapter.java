package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class foodAdapter extends ArrayAdapter<Food> {
    public foodAdapter(Context context, ArrayList<Food> foods){
        super(context, 0, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Food food = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.foodmenu, parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvId = convertView.findViewById(R.id.tvId);
        TextView tvValue = convertView.findViewById(R.id.tvValue);

        tvName.setText(food.foodName);
        tvId.setText(food.foodId);
        tvValue.setText(food.foodValue);
        return convertView;
    }
}
