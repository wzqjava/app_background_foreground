package com.example.wzq.app_background_foreground;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.Toast;

/**
 * author:Created by WangZhiQiang on 2017-05-21.
 */

public class MApp extends Application{
    int appcount;
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {
                appcount++;
            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {
                appcount--;
                if (appcount == 0) {
                    Toast.makeText(activity, "app处于后台运行", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
