package geniets.android;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by jjgha on 2016-07-03.
 */
public class GradetsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
