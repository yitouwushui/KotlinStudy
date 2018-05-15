package com.example.cccc.kotlinstudy.ui.fragment

import com.example.cccc.kotlinstudy.base.BaseFragment
import com.example.cccc.kotlinstudy.bean.TreeListResponse
import com.example.cccc.kotlinstudy.view.TypeFragmentView
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by cccc on 2018/5/14.
 */
class TypeFragment:BaseFragment(),TypeFragmentView{

    /**
     * scroll to top
     */
    fun smoothScrollToPosition() = recyclerView.scrollToPosition(0)

    override fun getTypeListSuccess(result: TreeListResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancelRequest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTypeListFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTypeListZero() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}