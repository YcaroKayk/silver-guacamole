package y.aula.app_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button  genButton, gameButton, invButton;
    Intent  otherActivity, otherActivity2, otherActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        genButton = (Button) findViewById(R.id.buttonGen);
        gameButton = (Button) findViewById(R.id.pptButton);
        invButton = (Button) findViewById(R.id.buttonInverter);
        otherActivity = new Intent(Main3Activity.this, valueGenerator.class);
        otherActivity2 = new Intent(Main3Activity.this, gamePage.class);
        otherActivity3 = new Intent(Main3Activity.this, inverterPage.class);

        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherActivity);
            }
        });

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherActivity2);
            }
        });

        invButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherActivity3);
            }
        });
    }
}
