package com.example.gzgbutterknife;

import android.app.Activity;

/**
 * 用于绑定activity     GzgButterKnife.bind(this)
 * @param
 */
public class GzgButterKnife {
    public static void bind(Activity activity){
        String name=activity.getClass().getName()+"_ViewBinding";
        try{
            Class<?> aClass=Class.forName(name);
            IBinder iBinder=(IBinder)aClass.newInstance();
            iBinder.bind(activity);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
