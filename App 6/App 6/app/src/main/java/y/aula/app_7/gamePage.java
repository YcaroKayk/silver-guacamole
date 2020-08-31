package y.aula.app_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class gamePage extends AppCompatActivity {
    ImageView adversaryImage;
    Random random;
    Button rockVar, paperVar, scissorVar;
    int varNumber, randomNumber;
    TextView gameResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        rockVar = (Button) findViewById(R.id.rockPlayerButton);
        paperVar = (Button) findViewById(R.id.paperPlayerButton);
        scissorVar = (Button) findViewById(R.id.scissorsPlayerButton);
        gameResultText = (TextView) findViewById(R.id.resultGame);
        adversaryImage = (ImageView) findViewById(R.id.adversaryPlay);
        random = new Random();

        rockVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                varNumber = 1;
                randomNumber = random.nextInt(3) + 1;
                if(varNumber == 1){
                    if(randomNumber == 1){
                        adversaryImage.setImageResource(R.drawable.rock);
                        gameResultText.setText("Empate.");
                    }
                    if(randomNumber == 2){
                        adversaryImage.setImageResource(R.drawable.aper);
                        gameResultText.setText("Adversário.");
                    }
                    if(randomNumber == 3){
                        adversaryImage.setImageResource(R.drawable.scissors);
                        gameResultText.setText("Jogador.");
                    }
                }
            }
        });

        paperVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                varNumber = 2;
                randomNumber = random.nextInt(3) + 1;
                if(varNumber == 2) {
                    if (randomNumber == 1) {
                        adversaryImage.setImageResource(R.drawable.rock);
                        gameResultText.setText("Jogador.");
                    }
                    if (randomNumber == 2) {
                        adversaryImage.setImageResource(R.drawable.aper);
                        gameResultText.setText("Empate.");
                    }
                    if (randomNumber == 3) {
                        adversaryImage.setImageResource(R.drawable.scissors);
                        gameResultText.setText("Adversário.");
                    }
                }
            }
        });

        scissorVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                varNumber = 3;
                randomNumber = random.nextInt(3) + 1;
                if(varNumber == 3) {
                    if (randomNumber == 1) {
                        adversaryImage.setImageResource(R.drawable.rock);
                        gameResultText.setText("Adversário.");
                    }
                    if (randomNumber == 2) {
                        adversaryImage.setImageResource(R.drawable.aper);
                        gameResultText.setText("Jogador.");
                    }
                    if (randomNumber == 3) {
                        adversaryImage.setImageResource(R.drawable.scissors);
                        gameResultText.setText("Empate.");
                    }
                }
            }
        });
    }
}
