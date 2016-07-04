package geniets.android.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import geniets.android.R;
import geniets.android.data.daos.EtudiantDAO;
import geniets.android.fragments.TodayTaskFragment;
import geniets.android.services.EtudiantService;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
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

    ActionBarDrawerToggle drawerToggle;

    private EtudiantDAO etudiant;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupDrawer();
        setSupportActionBar(toolbar);
        drawerToggle = setupDrawerToggle();
        drawerLayout.setDrawerListener(drawerToggle);

        etudiant = EtudiantService.read();

        toolbar_title.setText("Home");
        navbarTitle.setText(etudiant.prenom.trim() + " " + etudiant.nom.trim());
        navbarSubtitle.setText(etudiant.codePerm.trim());
        navigationView.setItemIconTintList(null);

        FragmentManager fragmentManager = getFragmentManager();
        TodayTaskFragment todayTaskFragment = new TodayTaskFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_fragmentContainer, todayTaskFragment);
        fragmentTransaction.commit();
        // ATTENTION: This was auto-generated to implement the App Indexing API.

    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.drawer_open, R.string.drawer_close);
    }

    private void setupDrawer() {

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        return false;
                    }
                }
        );
    }

    private void selectDrawerItem(MenuItem menuItem) {

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration config){
        super.onConfigurationChanged(config);
        drawerToggle.onConfigurationChanged(config);
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);

    }
}
