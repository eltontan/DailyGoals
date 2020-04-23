package sg.edu.rp.c346.id18016094.dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the button and set the OnClickListener
        Button btnDone = (Button) findViewById(R.id.buttonOK);
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                TextView boldText1 = (TextView) findViewById(R.id.BoldQns1);
                RadioButton radio1 = (RadioButton) findViewById(R.id.rd1);

                TextView boldText2 = (TextView) findViewById(R.id.BoldQns2);
                RadioButton radio4 = (RadioButton) findViewById(R.id.rd4);

                TextView boldText3 = (TextView) findViewById(R.id.BoldQns3);
                RadioButton radio5 = (RadioButton) findViewById(R.id.rd5);
                // Get the EditText that user keys in name
                EditText etName = (EditText) findViewById(R.id.editText);

                // Put the name and age into an array
                String[] info = {boldText1.getText().toString(),
                        radio1.getText().toString(),boldText2.getText().toString(),
                        radio4.getText().toString(), boldText3.getText().toString(),radio5.getText().toString(),
                        etName.getText().toString()};
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        Summary.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}