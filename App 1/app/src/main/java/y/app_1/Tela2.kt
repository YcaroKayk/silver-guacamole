package y.app_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import kotlinx.android.synthetic.main.page_2.*

class Tela2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_2)

        returnButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}