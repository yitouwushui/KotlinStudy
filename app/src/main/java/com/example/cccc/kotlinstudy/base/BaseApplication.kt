package com.example.cccc.kotlinstudy.base

import android.app.Application
import android.content.ComponentCallbacks2
import com.bumptech.glide.Glide
import com.example.cccc.kotlinstudy.BuildConfig
import com.squareup.leakcanary.LeakCanary
import javax.microedition.khronos.opengles.GL

/**
 * Created by cccc on 2018/5/11.
 */
class BaseApplication:Application(){
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            LeakCanary.install(this)
        }
        Preference.setContext(this)
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN){
            Glide.get(this).clearMemory()
        }
        Glide.get(this).trimMemory(level)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Glide.get(this).clearMemory();
    }

}