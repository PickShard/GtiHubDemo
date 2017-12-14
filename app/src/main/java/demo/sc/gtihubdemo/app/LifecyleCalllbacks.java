package demo.sc.gtihubdemo.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import demo.sc.gtihubdemo.utils.Log;

/**
 * Created by sc on 2017/5/9.
 */

public class LifecyleCalllbacks implements Application.ActivityLifecycleCallbacks {

    public static List<Activity> activities = new ArrayList<>();


    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.d(activity.getLocalClassName() + " created");
        activities.add(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.d(activity.getLocalClassName() + " started");
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.d(activity.getLocalClassName() + " resumed");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.d(activity.getLocalClassName() + " paused");
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.d(activity.getLocalClassName() + " stopped");
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Log.d(activity.getLocalClassName() + " saveInstanceState");
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.d(activity.getLocalClassName() + " destroyed");
        activities.remove(activity);
    }

}
