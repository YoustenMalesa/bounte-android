package za.co.bounte.framework;

import android.app.Application;

import retrofit2.Retrofit;

/**
 * Created by Rocky on 2018/01/10.
 */

public class BounteApplication extends Application {

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
