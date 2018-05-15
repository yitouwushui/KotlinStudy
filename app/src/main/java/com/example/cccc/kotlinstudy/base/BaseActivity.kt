package com.example.cccc.kotlinstudy.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import com.gyf.barlibrary.ImmersionBar

/**
 * Created by cccc on 2018/5/11.
 */
abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var immersionBar: ImmersionBar

    private val imm: InputMethodManager by lazy {
        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initImmersionBar()

    }

    open protected fun initImmersionBar() {
        //在BaseActivity里初始化
        immersionBar = ImmersionBar.with(this)
        immersionBar.init()

    }

    abstract fun setLayoutId(): Int

    /**
     * cancel request
     */
    protected abstract fun cancelRequest()

    override fun finish() {
        if (isFinishing) {
            super.finish()

        }
    }

    private fun hideSoftKeyBoard(){
        currentFocus?.let {
            imm.hideSoftInputFromWindow(it.windowToken,2)
        }
    }


}