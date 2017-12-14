package demo.sc.gtihubdemo.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

import demo.sc.gtihubdemo.app.LifecyleCalllbacks;

/**
 * Created by sc on 2017/5/9.
 */

public class MyAPP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        registerActivityLifecycleCallbacks(new LifecyleCalllbacks());
    }

}
