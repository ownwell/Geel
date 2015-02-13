/*
 * Copyright (c) 2014.
 * Shijiebang
 */

package me.cyning.common.utils;
import java.util.ArrayList;
/**
 * Created by CyningLi on 2014/10/24 0024.
 */
public class CollectionUtil {

    public static boolean  isListMoreOne(ArrayList mArrayList){
        if (mArrayList != null && mArrayList.size() >0)
            return  true;
        return false;
    }
}
