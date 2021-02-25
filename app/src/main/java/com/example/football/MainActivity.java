package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cancelButton = findViewById(R.id.cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        Button saveButton = findViewById(R.id.save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText homeTeam = findViewById(R.id.homeTeamNameET);
                EditText guestTeam = findViewById(R.id.guestTeamNameET);
                EditText homeGoals = findViewById(R.id.homeGoals);
                EditText guestGoals = findViewById(R.id.guestGoals);

                
                DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);
                MatchInfo matchInfo = new MatchInfo(1, "Liverpool", 3,
                        "Arsenal", 2);
                databaseHelper.insert(matchInfo);
                finish();
            }
        });
    }
}