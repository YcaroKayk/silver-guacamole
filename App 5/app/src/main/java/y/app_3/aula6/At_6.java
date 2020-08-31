package y.app_3.aula6;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class At_6 extends AppCompatActivity {
    private EditText Nome, CPF, telefone, celular, email;
    private TextView data;
    private Button btn;
    private DatePickerDialog.OnDateSetListener datepicker;
    String N, C, T, Ce, E;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.at_6);
        Nome = findViewById(R.id.Nome);
        CPF = findViewById(R.id.CPF);
        telefone = findViewById(R.id.Telefone);
        celular = findViewById(R.id.Celular);
        email = findViewById(R.id.Email);
        data = findViewById(R.id.Data);
        btn = findViewById(R.id.vai);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int dia = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                int mes = calendar.get(calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(At_6.this, R.style.Theme_AppCompat_Dialog, datepicker, ano, mes, dia);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
               }
        });
        datepicker = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month +=1;
                String texto = dayOfMonth + "/" + month + "/" + year;
                data.setText(texto);
            }
        };



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N=Nome.getText().toString();
                C=CPF.getText().toString();
                T=telefone.getText().toString();
                Ce=celular.getText().toString();
                E=email.getText().toString();

                Intent intent = new Intent(At_6.this, Resultado.class);
                intent.putExtra("nome",N);
                intent.putExtra("CPF",C);
                intent.putExtra("Nascimento", data.getText().toString());
                intent.putExtra("Telefone",T);
                intent.putExtra("Celular",Ce);
                intent.putExtra("Email",E);
                startActivity(intent);
            }
        });
    }
}
