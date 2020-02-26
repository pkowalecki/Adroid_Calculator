package pl.kowalecki.zad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view){
        Float result;
        TextView textView = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        String value1 = String.valueOf(spinner.getSelectedItem());
        String value2 = String.valueOf(spinner1.getSelectedItem());


        switch (view.getId()){

            case R.id.button1:
                result = Float.parseFloat(value1) + Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;

            case R.id.button2:
                result = Float.parseFloat(value1) - Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;

            case R.id.button3:
                result = Float.parseFloat(value1) * Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;

            case R.id.button4:
                if(Float.valueOf(value2) > 0 ) {
                    result = Float.parseFloat(value1) / Float.parseFloat(value2);
                    textView.setText(String.valueOf(result));
                }
                else textView.setText("Nie dziel przez 0");

                break;
        }

    }
}
