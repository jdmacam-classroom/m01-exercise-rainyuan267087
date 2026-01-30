package com.example.reyn;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView reyn;

    Button rain;

    ArrayList<String> facts = new ArrayList<>();

    int currentIndex = 0;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            reyn= findViewById(R.id.yuyu);
            rain =findViewById(R.id.yoyo);



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

            reyn.setText(facts.get(currentIndex));

            if(currentIndex < facts.size()) {
                reyn.setText(facts.get(currentIndex));
            } else {
                rain.setEnabled(false);
                rain.setText("no facts");
            }

        }
    }
