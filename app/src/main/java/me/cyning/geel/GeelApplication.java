package me.cyning.geel;

import org.litepal.LitePalContext;

import me.cyning.template.base.BaseApplication;

/**
 * Author: cyning
 * Date  : 2015.02.13
 * Time  : 5:27 PM
 */
public class GeelApplication extends BaseApplication{

    private LitePalContext mPalContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mPalContext = LitePalContext.getInstance();
        mPalContext.setContext(this.getApplicationContext());

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mPalContext.setContext(this.getApplicationContext());
    }
}
