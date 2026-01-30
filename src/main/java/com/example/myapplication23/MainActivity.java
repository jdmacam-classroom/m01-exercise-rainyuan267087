package com.example.myapplication23;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
public class MainActivity extends AppCompatActivity {

    TextView textView2;

    Button button;

    ArrayList<String> facts = new ArrayList<>();

    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        textView2= findViewById(R.id.textView2);
        button = findViewById(R.id.button);



        facts.add("To be interesting – be interested.");
        facts.add("everyone you meet is fighting a mighty battle. Be kind. Be understanding");
        facts.add("The minute you stop expecting life to be simple, fair and easy… it becomes simple, fair and easy.");
        facts.add("Hope is NOT a strategy");
        facts.add("A good CHARACTER to guide us and keep us on the proper course.");
        facts.add("A CAPACITY to enjoy the process along the way..");
        facts.add("Don’t Take Anything Personally.");
        facts.add(" A strong CONFIDENCE that we can attain the goal..");
        facts.add("Put First Things First");
        facts.add("Balance and renew your resources, energy, and health to create a sustainable, long-term, effective lifestyle. And learn from the mistakes.");

        textView2.setText(facts.get(currentIndex));

        if(currentIndex < facts.size()) {
            textView2.setText(facts.get(currentIndex));
        } else {
            button.setEnabled(false);
            button.setText("no facts");
        }

    }
}
      