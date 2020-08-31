package y.aula.app_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    Intent receptor;
    String auxReceptor;
    TextView originalResult, invertedResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        receptor = getIntent();
        auxReceptor = receptor.getStringExtra("myString");
        originalResult = (TextView) findViewById(R.id.resultOriginal);
        invertedResult = (TextView) findViewById(R.id.resultInverted);

        originalResult.setText(auxReceptor);
        invertedResult.setText(new StringBuilder(auxReceptor).reverse().toString());
    }
}
