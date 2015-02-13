package me.cyning.common.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.ImageView;

import java.lang.reflect.Field;

/**
 * Created by CyningLi on 2014/9/16 0016.
 */
public class SjbViewCompat {


    public static boolean hasFroyo() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
    }

    public static boolean hasGingerbread() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
    }

    public static boolean hasHoneycomb() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
    }

    public static boolean hasHoneycombMR1() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
    }
    public static boolean hasJellyBeanMR1() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
    public static boolean hasJellyBeanMR2() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    public static boolean hasKITKAT() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }
    public static boolean hasLOLLIPOP() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static int getMaxHeight(ImageView view) {
        if (hasJellyBean())
            return view.getMaxHeight();
        else {
            int maxHeight = -1;


            try {
                Field maxHeightField = ImageView.class.getDeclaredField("mMaxHeight");
                maxHeightField.setAccessible(true);

                maxHeight = (Integer) maxHeightField.get(view);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return maxHeight;
        }

    }

    public static int getMaxWidth(ImageView view) {
        if (hasJellyBean())
            return view.getMaxWidth();
        else {
            int maxWidth = -1;
            int maxHeight = -1;


            try {
                Field maxWidthField = ImageView.class.getDeclaredField("mMaxWidth");
                maxWidthField.setAccessible(true);

                maxWidth = (Integer) maxWidthField.get(view);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return maxWidth;
        }

    }
}
