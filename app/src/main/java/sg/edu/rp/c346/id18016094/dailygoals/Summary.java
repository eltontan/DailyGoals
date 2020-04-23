package sg.edu.rp.c346.id18016094.dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = findViewById(R.id.textView);
        // Display the name and age on the TextView
        tv1.setText(info[0] + " : " + info[1] + "\n" + info[2] + " : " + info[3] + "\n" + info[4] + " : " +
                info[5] + "\n" + "Reflection :" + info[6]);

    }
}

