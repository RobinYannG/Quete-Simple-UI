package fr.wcs.quetesimpleui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static fr.wcs.quetesimpleui.R.id.checkBox;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button) ;
        button.setOnClickListener(this) ;
    }


    
    public void onClick(View v) {
        if (v == button) {
            Toast.makeText(MainActivity.this, "Félicitations ",
                    Toast.LENGTH_LONG).show();
        }

    }
}
