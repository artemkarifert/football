package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        FloatingActionButton button = findViewById(R.id.floatingActionButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        ArrayList<MatchInfo> list = databaseHelper.selectAll();

        MatchesAdapter matchesAdapter = new MatchesAdapter();
        matchesAdapter.setList(list);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(matchesAdapter);
    }
}