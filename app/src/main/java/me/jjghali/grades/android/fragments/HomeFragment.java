package me.jjghali.grades.android.fragments;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import grades.android.R;


public class HomeFragment extends Fragment {

    @BindView(R.id.today_card)
    CardView todayCard;
    @BindView(R.id.todayCardTitle)
    TextView todayCardTitle;

    public HomeFragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today_task, container, false);
        ButterKnife.bind(this, view);
        todayCardTitle.setText("blob");
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    /**
     * Discards all the tasks showing up
     */
    @OnClick(R.id.tasksDiscardAll)
    public void discardAllTasks() {

    }
}
