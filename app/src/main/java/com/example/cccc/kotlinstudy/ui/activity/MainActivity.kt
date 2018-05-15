package com.example.cccc.kotlinstudy.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.AppCompatButton
import android.widget.TextView
import com.example.cccc.kotlinstudy.R
import com.example.cccc.kotlinstudy.base.BaseActivity
import com.example.cccc.kotlinstudy.ui.fragment.CommonUseFragment
import com.example.cccc.kotlinstudy.ui.fragment.HomeFragment
import com.example.cccc.kotlinstudy.ui.fragment.TypeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private var currentIndex = 0
    private var lastTime: Long = 0L
    private var homeFragment: HomeFragment? = null
    private var typeFragment: TypeFragment? = null
    private var commonUseFragment: CommonUseFragment? = null
    private val fragmentManager by lazy {
        supportFragmentManager
    }

    private lateinit var navigationViewUserName: TextView

    private lateinit var navigationViewLogout: AppCompatButton

    override fun cancelRequest() {

    }

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun initImmersionBar() {
        super.initImmersionBar()
        immersionBar.titleBar(R.id.toolbar).init()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toolbar.run {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }
        bottomNavigation.run {
            setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        }


    }

    private val onNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                setFragment(item.itemId)
                return@OnNavigationItemSelectedListener when (item.itemId) {
                    R.id.navigation_home -> {
                        if (currentIndex == R.id.navigation_home) {
                            homeFragment?.smoothScrollToPosition()
                        }
                        true
                    }
                    R.id.navigation_type -> {
                        if (currentIndex == R.id.navigation_type) {
                            typeFragment?.smoothScrollToPosition()
                        }
                        true
                    }
                    else -> {
                        false
                    }
                }
            }

    private fun setFragment(index: Int) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        fragmentManager.beginTransaction().apply {
            homeFragment ?: let {
                HomeFragment().let {
                    homeFragment = it
                    add(R.id.content, it)
                }
            }
            typeFragment ?: let {
                TypeFragment().let {
                    typeFragment = it
                    add(R.id.content, it)
                }
            }
            commonUseFragment ?: let {
                CommonUseFragment().let {
                    commonUseFragment = it
                    add(R.id.content, it)
                }
            }
            hideFragment(this)
            when (index) {
                R.id.navigation_home -> {
                    toolbar.title = getString(R.string.app_name);
                    homeFragment?.let {
                        this.show(it)
                    }
                }
                R.id.navigation_type -> {
                    toolbar.title = getString(R.string.title_dashboard)
                    typeFragment?.let {
                        this.show(it)
                    }
                }
                R.id.menuHot -> {
                    toolbar.title = getString(R.string.hot_title)
                    commonUseFragment?.let {
                        this.show(it)
                    }
                }
            }
        }.commit()
    }

    private fun hideFragment(fragmentTransaction: FragmentTransaction) {
        homeFragment?.let {
            fragmentTransaction.hide(it)
        }
        typeFragment?.let {
            fragmentTransaction.hide(it)
        }
        commonUseFragment?.let {
            fragmentTransaction.hide(it)
        }
    }

}
