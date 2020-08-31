//Alunos:
//  Ycaro Kayk Fernandes Ferreira dos Santos.
//  Guilherme Neves Canedo.
package y.aula.app_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button membersButton,activityButton;
    Intent otherActivity, otherActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        membersButton = (Button) findViewById(R.id.buttonMember);
        activityButton = (Button) findViewById(R.id.startButton);
        otherActivity = new Intent(MainActivity.this, Main2Activity.class);
        otherActivity2 = new Intent(MainActivity.this, Main3Activity.class);

        membersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherActivity);
            }
        });

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherActivity2);
            }
        });
    }
}
