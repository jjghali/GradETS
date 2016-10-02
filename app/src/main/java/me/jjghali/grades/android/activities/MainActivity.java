package me.jjghali.grades.android.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import grades.android.R;
import me.jjghali.grades.android.data.daos.EtudiantDAO;
import me.jjghali.grades.android.fragments.FullScheduleFragment;
import me.jjghali.grades.android.fragments.GradesFragment;
import me.jjghali.grades.android.fragments.HomeFragment;
import me.jjghali.grades.android.fragments.ProfileFragment;
import me.jjghali.grades.android.fragments.SettingsFragment;
import me.jjghali.grades.android.services.EtudiantService;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
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


        navbarTitle.setText(etudiant.prenom.trim() + " " + etudiant.nom.trim());
        navbarSubtitle.setText(etudiant.codePerm.trim());
        navigationView.setItemIconTintList(null);

        FragmentManager fragmentManager = getFragmentManager();
        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_fragmentContainer, homeFragment);
        setTitle(R.string.navTitle_home);
        fragmentTransaction.commit();
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.drawer_open, R.string.drawer_close) {
            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
    }

    private void setupDrawer() {

        navigationView.setNavigationItemSelectedListener(
                menuItem -> {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Fragment fragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_home:
                            fragment = new HomeFragment();
                            setTitle(R.string.navTitle_home);
                            break;

                        case R.id.nav_fullSchedule:
                            fragment = new FullScheduleFragment();
                            setTitle(R.string.navTitle_schedule);
                            break;

                        case R.id.nav_grades:
                            fragment = new GradesFragment();
                            setTitle(R.string.navTitle_grades);
                            break;

                        case R.id.nav_settings:
                            fragment = new SettingsFragment();
                            setTitle(R.string.navTitle_settings);
                            break;

                        case R.id.nav_profile:
                            fragment = new ProfileFragment();
                            setTitle(R.string.navTitle_profile);
                            break;

                        case R.id.nav_logoff:
                            //TODO: make logoff strategy here
                            break;
                    }

                    fragmentTransaction.replace(R.id.main_fragmentContainer, fragment);
                    fragmentTransaction.commit();
                    drawerLayout.closeDrawer(navigationView);

                    return false;
                }
        );
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration config) {
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