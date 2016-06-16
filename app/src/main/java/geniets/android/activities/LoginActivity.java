package geniets.android.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import geniets.android.R;
import geniets.soap.Etudiant;
import geniets.soap.SignetsMobile;
import geniets.soap.SignetsMobileSoap;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        AccountWrapper accountWrapper = AccountWrapper.getInstance();
//        AccountWrapper.login("***REMOVED***","***REMOVED***");
        SignetsMobileSoap soap = new SignetsMobile().getSignetsMobileSoap();
        Etudiant etudiant = soap.infoEtudiant("***REMOVED***","***REMOVED***");
        System.out.println();
        setContentView(R.layout.activity_login);

    }
}
