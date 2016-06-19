package geniets.android.activities;

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
import geniets.android.data.UserService;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.loginButton)
    Button loginButton;
    @BindView(R.id.loginUsername)
    EditText loginUsername;
    @BindView(R.id.loginPassword)
    EditText loginPassword;

    private UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userService = new UserService();

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.loginButton)
    public void loginButton_clicked(View view) {
        String username = loginUsername.getText().toString().trim().toLowerCase();
        String password = loginPassword.getText().toString();
        boolean isLoginValid = userService.isLoginValid(username, password);

        Toast.makeText(this, (isLoginValid ? "Logged in successfully" : "Invalid credentials"),
                Toast.LENGTH_LONG).show();

    }
}