package y.aula.app_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class nameActivity extends AppCompatActivity {
    Intent receptor;
    String name;
    TextView finalTextP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        finalTextP = (TextView) findViewById(R.id.finalText);
        receptor = getIntent();
        name = receptor.getStringExtra("myString");
        finalTextP.setText(name);
    }
}
