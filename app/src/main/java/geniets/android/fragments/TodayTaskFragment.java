package geniets.android.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import geniets.android.R;


public class TodayTaskFragment extends Fragment {

    @BindView(R.id.today_card)
    CardView todayCard;
    @BindView(R.id.titre_section)
    TextView titreSection;

    public TodayTaskFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today_task, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
