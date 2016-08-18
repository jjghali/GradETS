package me.jjghali.grades.android.util;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import me.jjghali.grades.android.data.Constants;

import static android.accounts.AccountManager.KEY_BOOLEAN_RESULT;

public class Authenticator extends AbstractAccountAuthenticator {
    private final Context context;
    private final Class loginActivity;

    public Authenticator(Context context, Class loginActivity) {
        super(context);
        this.context = context;
        this.loginActivity = loginActivity;
    }

    @Override
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                 String s) {
        return null;
    }

    @Override
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse,
                             String authTokenType, String accountType, String[] strings,
                             Bundle mBundle) throws NetworkErrorException {
        final Intent intent = new Intent(context, loginActivity);
        intent.putExtra(Constants.KEY_ACCOUNT_TYPE, accountType);
        intent.putExtra(Constants.KEY_AUTH_TYPE, authTokenType);
        intent.putExtra(Constants.KEY_IS_ADDING_NEW_ACCOUNT, true);
        intent.putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE,
                accountAuthenticatorResponse);

        final Bundle bundle = new Bundle();
        bundle.putParcelable(AccountManager.KEY_INTENT, intent);
        return bundle;
    }

    @Override
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                     Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse,
                               Account account, String authTokenType,
                               Bundle bundle) throws NetworkErrorException {
        final AccountManager am = AccountManager.get(context);
        String authToken = am.peekAuthToken(account, authTokenType);

        final Bundle result = new Bundle();
        result.putString(AccountManager.KEY_ACCOUNT_NAME, account.name);
        result.putString(AccountManager.KEY_ACCOUNT_TYPE, account.type);

        if (!TextUtils.isEmpty(authToken)) {
            result.putString(AccountManager.KEY_AUTHTOKEN, authToken);
        } else {
            result.putString(AccountManager.KEY_AUTHTOKEN, null);
        }
        return result;
    }

    @Override
    public String getAuthTokenLabel(String s) {
        return null;
    }

    @Override
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                    Account account, String s,
                                    Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse,
                              Account account, String[] strings) throws NetworkErrorException {
        final Bundle result = new Bundle();
        result.putBoolean(KEY_BOOLEAN_RESULT, false);
        return result;
    }
}
