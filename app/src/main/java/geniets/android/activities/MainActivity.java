package geniets.android.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import geniets.android.R;
import geniets.android.fragments.TodayTaskFragment;

public class MainActivity extends Activity {

    @BindView(R.id.toolbar_title)
    TextView toolbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar_title.setText("suprise! BOB!");

        FragmentManager fragmentManager = getFragmentManager();

        TodayTaskFragment todayTaskFragment = new TodayTaskFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.main_fragmentContainer, todayTaskFragment);
        fragmentTransaction.commit();


    }
}
