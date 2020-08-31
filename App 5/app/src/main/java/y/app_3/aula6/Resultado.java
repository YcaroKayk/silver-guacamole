package y.app_3.aula6;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    TextView Nome, CPF, Data, Telefone, Celular, Email;
    String dataIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Nome = findViewById(R.id.Nm);
        CPF = findViewById(R.id.CPFm);
        Data = findViewById(R.id.Nasc);
        Telefone = findViewById(R.id.Tel);
        Celular = findViewById(R.id.Cel);
        Email = findViewById(R.id.Em);


        Intent receba = getIntent();
        dataIntent = receba.getStringExtra("nome");
        Nome.setText("nome: " + dataIntent);

        dataIntent = receba.getStringExtra("CPF");
        CPF.setText("CPF: " + dataIntent);

        dataIntent = receba.getStringExtra("Nascimento");
        Data.setText("Nascimento: " + dataIntent);

        dataIntent = receba.getStringExtra("Telefone");
        Telefone.setText("Telefone: " + dataIntent);

        dataIntent = receba.getStringExtra("Celular");
        Celular.setText("Celular: " + dataIntent);

        dataIntent = receba.getStringExtra("Email");
        Email.setText("Email: " + dataIntent);

        Toast.makeText(this, "data intent",Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Toast.makeText(this, "data intent",Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);


    }
}
