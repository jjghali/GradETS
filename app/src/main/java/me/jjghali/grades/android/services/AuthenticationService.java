package me.jjghali.grades.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import me.jjghali.grades.android.activities.LoginActivity;
import me.jjghali.grades.android.util.Authenticator;

public class AuthenticationService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Authenticator authenticator = new Authenticator(this, LoginActivity.class);
        return authenticator.getIBinder();
    }
}
