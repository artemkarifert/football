package com.example.football;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchesAdapter extends BaseAdapter {
    ArrayList<MatchInfo> list = new ArrayList<>();

    public void setList(ArrayList<MatchInfo> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_match, null);
        }

        TextView homeTeamName = view.findViewById(R.id.homeTeamName);
        homeTeamName.setText(list.get(i).getTeamHome());

        TextView homeGoals = view.findViewById(R.id.homeGoals);
        homeGoals.setText(Integer.toString(list.get(i).getGoalHome()));

        TextView guestTeamName = view.findViewById(R.id.guestTeamName);
        guestTeamName.setText(list.get(i).getTeamGuest());

        TextView guestGoals = view.findViewById(R.id.guestGoals);
        guestGoals.setText(Integer.toString(list.get(i).getGoalGuest()));


        return view;
    }
}
