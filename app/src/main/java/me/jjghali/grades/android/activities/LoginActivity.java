package me.jjghali.grades.android.activities;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import grades.android.R;
import me.jjghali.grades.android.data.Constants;
import me.jjghali.grades.android.data.soap.Etudiant;
import me.jjghali.grades.android.repositories.EtudiantRepository;
import me.jjghali.grades.android.services.EtudiantService;

public class LoginActivity extends AccountAuthenticatorActivity {
    public AccountAuthenticatorResponse response;
    @BindView(R.id.loginButton)
    Button loginButton;
    @BindView(R.id.loginUsername)
    EditText loginUsername;
    @BindView(R.id.loginPassword)
    EditText loginPassword;
    private EtudiantRepository etudiantRepository;

    private AccountManager accountManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (EtudiantService.read() != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {

            setContentView(R.layout.activity_login);
            ButterKnife.bind(this);

            accountManager = AccountManager.get(getBaseContext());

            etudiantRepository = new EtudiantRepository();
        }
    }

    @OnClick(R.id.loginButton)
    public void loginButton_clicked(View view) {
        String username = loginUsername.getText().toString().trim().toLowerCase();
        String password = loginPassword.getText().toString();
        boolean isLoginValid = etudiantRepository.isLoginValid(username, password);

        if (isLoginValid) {
            Etudiant etudiant = etudiantRepository.getInfoEtudiant(username, password);
            MessageDigest cript = null;


            try {
                cript = MessageDigest.getInstance("SHA-1");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            cript.reset();
            try {
                cript.update(password.getBytes("utf8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            etudiant.passwordHash = new String(cript.digest());
            createAccount(username, password);
            EtudiantService.insertOrUpdate(etudiant);
        }

        Toast.makeText(this, (isLoginValid ? "Logged in successfully" : "Invalid credentials"),
                Toast.LENGTH_LONG).show();


    }

    private void createAccount(String accountName, String accountPassword) {
        final Account account = new Account(accountName, Constants.ACCOUNT_TYPE);

        if (getIntent().getBooleanExtra(Constants.KEY_IS_ADDING_NEW_ACCOUNT, false)) {

            // Creating the account on the device and setting the auth token we got
            // (Not setting the auth token will cause another call to the server to authenticate the user)
            accountManager.addAccountExplicitly(account, accountPassword, null);

        } else {
            accountManager.setPassword(account, accountPassword);
        }

        Intent intent = new Intent();
        intent.putExtra(AccountManager.KEY_ACCOUNT_NAME, accountName);
        intent.putExtra(AccountManager.KEY_ACCOUNT_TYPE, Constants.ACCOUNT_TYPE);

        setAccountAuthenticatorResult(intent.getExtras());
        setResult(RESULT_OK, intent);
    }
}