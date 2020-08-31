package y.app_3.aula6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calendario extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendario);
        CalendarView calendarView = findViewById(R.id.calendr);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String data = dayOfMonth+"/"+(month+1)+"/"+year;
                Intent i = new Intent(Calendario.this, tela_3.class);
                i.putExtra("data", data);
                startActivity(i);
                finish();
            }
        });

    }
}
