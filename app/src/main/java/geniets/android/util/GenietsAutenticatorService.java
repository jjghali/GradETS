package geniets.android.util;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by jjghali on 6/21/16.
 */
public class GenietsAutenticatorService extends Service{
    @Override
    public IBinder onBind(Intent intent) {
        GenietsAuthenticator authenticator = new GenietsAuthenticator(this);
        return authenticator.getIBinder();
    }
}
