package org.litepal;

import android.content.Context;

/**
 * Author: cyning
 * Date  : 2015.02.13
 * Time  : 3:50 PM
 */
public class LitePalContext {

    private static LitePalContext mInstance = null;

    private Context mContext;

    public static LitePalContext getInstance() {
        if (mInstance == null) {
            synchronized (LitePalContext.class) {
                if (mInstance == null) {
                    mInstance = new LitePalContext();
                }
            }
        }
        return mInstance;
    }

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context _context) {
        mContext = _context;
    }
}
