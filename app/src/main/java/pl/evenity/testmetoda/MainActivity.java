package pl.evenity.testmetoda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void action (View view) {
        test xxx = new test();
        xxx.getSample();
        if (TextUtils.isEmpty(xxx.liczba1)){
            Toast.makeText(this, "Wpisz jakąś liczbę", Toast.LENGTH_SHORT).show();
            return;
        } else { xxx.setText("Pokazuje wpisaną liczbę: "+xxx.liczba1);
        }
    }
}
