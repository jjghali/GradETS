package geniets.android.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ksoap2.serialization.SoapSerializationEnvelope;

import java.util.concurrent.ExecutionException;

import geniets.android.R;
import geniets.android.soap.Etudiant;
import geniets.android.soap.SignetsMobileSoap;

public class LoginActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://signets-ens.etsmtl.ca/Secure/WebServices/SignetsMobile.asmx/infoEtudiant";
    private Etudiant etudiant;
    private SignetsMobileSoap soap = new SignetsMobileSoap();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AsyncClassWS task = new AsyncClassWS();
        task.execute();
        try {
            etudiant = (Etudiant) task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println();
        setContentView(R.layout.activity_login);

    }

    private class AsyncClassWS extends AsyncTask<Void, Void, Object> {

        @Override
        protected Object doInBackground(Void... voids) {
            Object response = null;
            try {
                response = soap.infoEtudiant("id", "password");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return response;
        }

        @Override
        protected void onPostExecute(Object result) {

            super.onPostExecute(result);
        }

    }
}
