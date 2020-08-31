package y.aula.app_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class inverterPage extends AppCompatActivity {
    Button invertTextButton;
    String nextPageText;
    EditText insertedInvert;
    Intent nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverter_page);

        invertTextButton = (Button) findViewById(R.id.inversorButton);
        insertedInvert = (EditText) findViewById(R.id.inversorText);
        nextPage = new Intent(inverterPage.this, Main4Activity.class);

        invertTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPageText = insertedInvert.getText().toString();
                nextPage.putExtra("myString", nextPageText);
                startActivity(nextPage);
            }
        });
    }
}
