package pl.evenity.testmetoda;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mateusz on 2017-12-19.
 */

public class test extends MainActivity {

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
