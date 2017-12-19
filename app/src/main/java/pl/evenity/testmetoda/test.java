package pl.evenity.testmetoda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mateusz on 2017-12-19.
 */

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }

    String liczba1;

    public void getSample () {
        EditText edittext = findViewById(R.id.editText);
        String edittextString = edittext.getText().toString();
        liczba1=edittextString;
    }
    public void setText (String someTextHere) {
        TextView textvieww = findViewById(R.id.textview);
        textvieww.setText(someTextHere);
    }

}
