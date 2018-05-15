package com.example.cccc.kotlinstudy.base

import android.support.v4.app.Fragment

/**
 * Created by cccc on 2018/5/14.
 */
abstract class BaseFragment : Fragment() {
    protected var isFirst : Boolean = true

    /**
     * cancel request
     */
    protected abstract fun cancelRequest()

    override fun onDestroy() {
        cancelRequest()
        super.onDestroy()
    }
}