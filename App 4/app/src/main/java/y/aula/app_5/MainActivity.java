package y.aula.app_5;

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
    Button saveNameButton, listButton;
    EditText varName;
    Intent otherActivity,intentItems;
    ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveNameButton = (Button) findViewById(R.id.saveButton);
        listButton = (Button) findViewById(R.id.listButton);
        varName = (EditText) findViewById(R.id.textName);
        otherActivity = new Intent(MainActivity.this,ListActivity.class);

        saveNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names.add(varName.getText().toString());
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherActivity.putExtra("myArray",names);
                startActivity(otherActivity);
            }
        });
    }
}
