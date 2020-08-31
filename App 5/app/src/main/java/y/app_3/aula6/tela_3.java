package y.app_3.aula6;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class tela_3 extends AppCompatActivity {
    private TextView data, data2;
    private Button btn4;
    private DatePickerDialog.OnDateSetListener datePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_3);
        data = findViewById(R.id.data);
        data2 = findViewById(R.id.data2);
        btn4 = findViewById(R.id.buto4);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(tela_3.this, android.R.style.Theme_Holo_Dialog_MinWidth, datePicker, ano, mes, dia);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        datePicker = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month +=1;
                String texto = dayOfMonth + "/" +month+"/"+year;
                data.setText(texto);
            }
        };
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tela_3.this,Calendario.class);
                startActivity(intent);
            }
        });

        Intent receba = getIntent();
        String dataIntent = receba.getStringExtra("data");
        data2.setText(dataIntent);
    }
}
