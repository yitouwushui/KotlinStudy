package com.example.cccc.kotlinstudy.presenter

import com.example.cccc.kotlinstudy.bean.BannerResponse
import com.example.cccc.kotlinstudy.bean.HomeListResponse
import com.example.cccc.kotlinstudy.view.CollectArticleView
import com.example.cccc.kotlinstudy.view.HomeFragmentView

/**
 * Created by cccc on 2018/5/22.
 */
class HomeFragmentPresenterImpl(
        private val homeFragmentView: HomeFragmentView,
        private val collectArticleView: CollectArticleView
) : HomePresenter.OnHomeListListener, HomePresenter.OnCollectArticleListener, HomePresenter.OnBannerListener {

    override fun getHomeListSuccess(result: HomeListResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeListFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collectArticleListener(id: Int, isAdd: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collectArticleSuccess(result: HomeListResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collectArticleFailed(errorMessage: String?, isAdd: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBanner() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBannerSuccess(result: BannerResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBannerFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getHomeList(page: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}