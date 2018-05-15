package com.example.cccc.kotlinstudy.ui.fragment

import Constant
import android.content.Intent
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.cccc.kotlinstudy.R
import com.example.cccc.kotlinstudy.base.BaseFragment
import com.example.cccc.kotlinstudy.bean.FriendListResponse
import com.example.cccc.kotlinstudy.bean.HotKeyResponse
import com.example.cccc.kotlinstudy.view.CommonUseFragmentView
import com.zhy.view.flowlayout.TagFlowLayout


class CommonUseFragment : BaseFragment(), CommonUseFragmentView {

    private var mainView: View? = null
    private val datas = mutableListOf<FriendListResponse.Data>()
    /**
     * common use and hot key layout
     */
    private lateinit var flowLayout: LinearLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_home, container, false)
            flowLayout = activity.layoutInflater.inflate(R.layout.common_hot,null) as LinearLayout

        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun cancelRequest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFriendListSuccess(bookmarkResult: FriendListResponse?, commonResult: FriendListResponse, hotResult: HotKeyResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFriendListFailed(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFriendListZero() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
