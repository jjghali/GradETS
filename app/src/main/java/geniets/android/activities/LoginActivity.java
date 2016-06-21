package geniets.android.activities;

import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import geniets.android.R;
import geniets.android.data.soap.Etudiant;
import geniets.android.repositories.EtudiantRepository;
import geniets.android.services.EtudiantService;

public class LoginActivity extends AccountAuthenticatorActivity {
    public static final String ARG_ACCOUNT_TYPE = "ARG_ACCOUNT_TYPE";
    public static final String ARG_AUTH_TYPE = "ARG_AUTH_TYPE";
    public static final String ARG_IS_ADDING_NEW_ACCOUNT = "ARG_IS_ADDING_NEW_ACCOUNT";
    public static final String ARG_ACCOUNT_NAME = "ARG_ACCOUNT_NAME";

    @BindView(R.id.loginButton)
    Button loginButton;
    @BindView(R.id.loginUsername)
    EditText loginUsername;
    @BindView(R.id.loginPassword)
    EditText loginPassword;

    private EtudiantRepository etudiantRepository;
    private EtudiantService etudiantService;
    private AccountManager mAccountManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etudiantRepository = new EtudiantRepository();
        etudiantService = new EtudiantService(this);

        mAccountManager = AccountManager.get(getBaseContext());


        ButterKnife.bind(this);
    }

    @OnClick(R.id.loginButton)
    public void loginButton_clicked(View view) {
        String username = loginUsername.getText().toString().trim().toLowerCase();
        String password = loginPassword.getText().toString();
        boolean isLoginValid = etudiantRepository.isLoginValid(username, password);

        if (isLoginValid) {
            Etudiant etudiant = etudiantRepository.getInfoEtudiant(username, password);
            Etudiant result = etudiantService.insertOrReplaceEtudiant(etudiant);
//            mAccountManager.
        }

        Toast.makeText(this, (isLoginValid ? "Logged in successfully" : "Invalid credentials"),
                Toast.LENGTH_LONG).show();

    }
}