package me.cyning.template.base;

import android.app.Application;
import android.content.Intent;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cyning on 12/2/14.
 */
public class BaseApplication extends Application {


    protected final Set<BaseActivity> activityPool = new HashSet<BaseActivity>();
    protected final Set<String> serviceNamePool = new HashSet<String>();

    @Override
    public void onCreate() {
        super.onCreate();

        initConfig();
    }


    protected void initConfig() {


    }


    @Override
    public void onTerminate() {
        super.onTerminate();

    }



    public void addActivity(BaseActivity activity) {
        activityPool.add(activity);
    }

    public void removeActivity(BaseActivity activity) {
        activityPool.remove(activity);
    }

    public void addService(String serviceName) {
        serviceNamePool.add(serviceName);
    }

    public void exit() {
        for (BaseActivity ac : activityPool) {
            ac.finish();
        }
        for (String serviceName : serviceNamePool) {
            try {
                stopService(new Intent(this, Class.forName(serviceName)));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        onTerminate();
    }

    public Set<BaseActivity> getAllActivity() {
        return activityPool;
    }


}
