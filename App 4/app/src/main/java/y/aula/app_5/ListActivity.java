package y.aula.app_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView nameList;
    ArrayAdapter adapter;
    Intent receptor,otherActivity;
    ArrayList<String> receptorArray;
    String itemSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        nameList = (ListView) findViewById(R.id.listNames);
        receptor = getIntent();
        receptorArray = receptor.getStringArrayListExtra("myArray");
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,receptorArray);
        nameList.setAdapter(adapter);
        otherActivity = new Intent(ListActivity.this, nameActivity.class);

        nameList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemSelected = (String) parent.getItemAtPosition(position);
                otherActivity.putExtra("myString", itemSelected);
                startActivity(otherActivity);
            }
        });
    }
}
