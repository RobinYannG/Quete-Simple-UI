package fr.wcs.quetesimpleui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final Button button = (Button) findViewById(R.id.button);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);

        editText.setEnabled(false);
        editText3.setEnabled(false);
        button.setEnabled(false);
        textView2.setVisibility(View.INVISIBLE);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                editText.setEnabled(checkBox.isChecked());
                editText3.setEnabled(checkBox.isChecked());
                button.setEnabled(checkBox.isChecked());

                if (!isChecked){
                    textView2.setVisibility(View.INVISIBLE);
                    editText.setText(null);
                    editText3.setText(null);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (editText.length() == 0 || editText3.length() ==0){
                    Toast.makeText(MainActivity.this, getString(R.string.Toast),
                            Toast.LENGTH_LONG).show();
                    textView2.setVisibility(View.INVISIBLE);
                }
                else {
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(getString(R.string.Felicitation) + editText.getText() + " " + editText3.getText());
                }
            }
        });
    }

}
