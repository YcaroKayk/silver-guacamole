package y.aula.app_7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class valueGenerator extends AppCompatActivity {
    EditText campMax, campMin;
    int maxVar, minVar, varResult;
    TextView textResult;
    Button genButton, flexButton;
    Random randomNumber;
    String varResultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_generator);

        campMin = (EditText) findViewById(R.id.minNum);
        campMax = (EditText) findViewById(R.id.maxNum);
        textResult = (TextView) findViewById(R.id.resText);
        genButton = (Button) findViewById(R.id.buttonConfirm);
        flexButton = (Button) findViewById(R.id.flexGer);
        randomNumber = new Random();

        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                varResult = randomNumber.nextInt();
                varResultString = Integer.toString(varResult);
                textResult.setText(varResultString);
            }
        });

        flexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maxVar = Integer.parseInt(campMax.getText().toString());
                minVar = Integer.parseInt(campMin.getText().toString());
                varResult = randomNumber.nextInt((maxVar-minVar)+1)+minVar;
                varResultString = Integer.toString(varResult);
                textResult.setText(varResultString);
            }
        });
    }
}
