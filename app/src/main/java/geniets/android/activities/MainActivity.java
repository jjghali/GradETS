package geniets.android.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import geniets.android.R;
import geniets.android.data.soap.Etudiant;
import geniets.android.fragments.TodayTaskFragment;
import geniets.android.services.EtudiantService;

public class MainActivity extends Activity {

    @BindView(R.id.toolbar_title)
    TextView toolbar_title;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.navbar_title)
    TextView navbarTitle;
    @BindView(R.id.navbar_subtitle)
    TextView navbarSubtitle;

    private Etudiant etudiant;
//    @BindView(R.id.toolbar)
//    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        EtudiantService etudiantService = new EtudiantService(this);
        etudiant = etudiantService.getEtudiant();

        toolbar_title.setText("Home");
        navbarTitle.setText(etudiant.prenom.trim() + " " + etudiant.nom.trim());
        navbarSubtitle.setText(etudiant.codePerm.trim());


        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
        FragmentManager fragmentManager = getFragmentManager();

        TodayTaskFragment todayTaskFragment = new TodayTaskFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.main_fragmentContainer, todayTaskFragment);
        fragmentTransaction.commit();


    }

}
