package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        MatchInfo matchInfo = new MatchInfo(1, "Liverpool", 3,
                "Arsenal", 2);
        databaseHelper.insert(matchInfo);

        ArrayList<MatchInfo> list = databaseHelper.selectAll();
        Log.d("", "");
    }
}