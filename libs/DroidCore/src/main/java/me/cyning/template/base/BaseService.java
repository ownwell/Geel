package me.cyning.template.base;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by cyning on 12/2/14.
 */
public class BaseService extends Service {
    BaseApplication  mBaseApplication = null;
    @Override
    public void onCreate() {
        super.onCreate();
       Application mApplication = getApplication();
       if (mApplication == null){
           mBaseApplication  = (BaseApplication)mApplication;
       }

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
