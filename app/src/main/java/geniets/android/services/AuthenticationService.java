package geniets.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import geniets.android.activities.LoginActivity;
import geniets.android.util.Authenticator;

public class AuthenticationService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Authenticator authenticator = new Authenticator(this, LoginActivity.class);
        return authenticator.getIBinder();
    }
}
