package y.app_3.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2, txt3, txt4;
    int vet[], aux;
    TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.Valor1);
        txt2 = findViewById(R.id.Valor2);
        txt3 = findViewById(R.id.Valor3);
        txt4 = findViewById(R.id.Valor4);
        vet[1] = Integer.parseInt(txt1.toString());
        vet[2] = Integer.parseInt(txt2.toString());
        vet[3] = Integer.parseInt(txt3.toString());
        vet[4] = Integer.parseInt(txt4.toString());

        resp = findViewById(R.id.Resultado);
    }

    public void ordem(View view){
        resp.setText(txt1.getText().toString() + " " + txt2.getText().toString() + " " + txt3.getText().toString() + " " + txt4.getText().toString());
    }

    public void crescente(View view){
        //bubble sort
        for (int i=0; i<4; i++){
            for (int j = i+1; i<4; i++){
                if (vet[i] < vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = vet[i];
                }
            }
        }
        for(int i=0; i<4;i++)
        resp.setText(vet[i] + " ");
    }

    public void decrescente(View view){
        //bubblesort
        for (int i=0; i<4; i++){
            for (int j = i+1; i<4; i++){
                if (vet[i] < vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = vet[i];
                }
            }
        }
        for(int i=4; i>0;i++)
            resp.setText(vet[i] + " ");
    }


}
