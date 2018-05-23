package com.example.cccc.kotlinstudy.ui.fragment

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cccc.kotlinstudy.R
import com.example.cccc.kotlinstudy.adapter.HomeAdapter
import com.example.cccc.kotlinstudy.base.BaseFragment
import com.example.cccc.kotlinstudy.bean.BannerResponse
import com.example.cccc.kotlinstudy.bean.Datas
import com.example.cccc.kotlinstudy.bean.HomeListResponse
import com.example.cccc.kotlinstudy.presenter.HomeFragmentPresenterImpl
import com.example.cccc.kotlinstudy.ui.view.HorizontalRecyclerView
import com.example.cccc.kotlinstudy.view.CollectArticleView
import com.example.cccc.kotlinstudy.view.HomeFragmentView
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.home_banner.*

/**
 * Created by cccc on 2018/5/14.
 */
class HomeFragment : BaseFragment(), HomeFragmentView, CollectArticleView {

    private var mainView: View? = null

    private val datas = mutableListOf<Datas>()

    private val homeFragmentPresenter : HomeFragmentPresenterImpl by lazy {
        HomeFragmentPresenterImpl(this,this)
    }

    private val homeAdapter:HomeAdapter by lazy {
        HomeAdapter(context,datas)
    }

    private lateinit var horizontalRecyclerView: HorizontalRecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_home, container, false)
            horizontalRecyclerView = activity.layoutInflater
                    .inflate(R.layout.home_banner, null) as HorizontalRecyclerView

        }
        return mainView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        swipeRefreshLayout.run {
            isRefreshing = true
            setOnRefreshListener { onRefreshListener }
        }
    }

    /***
     * RefreshListener
     */
    private val onRefreshListener = SwipeRefreshLayout.OnRefreshListener {
        refreshData()
    }

    /**
     * refreshData
     */
    fun refreshData() {
        swipeRefreshLayout.isRefreshing = true

    }


    /**
     * scroll to top
     */
    fun smoothScrollToPosition() = recyclerView.scrollToPosition(0)

    override fun collectArticleSuccess(result: HomeListResponse, isAdd: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeListSuccess(result: HomeListResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeListFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collectArticleFailed(errorMessage: String?, isAdd: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeListZero() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeListSmall(result: HomeListResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBannerSuccess(result: BannerResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBannerFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBannerZero() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancelRequest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}