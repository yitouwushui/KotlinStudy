package  com.example.cccc.kotlinstudy.view

import com.example.cccc.kotlinstudy.bean.FriendListResponse
import com.example.cccc.kotlinstudy.bean.HotKeyResponse


/**
 * CommonUse Fragment View interface
 */
interface CommonUseFragmentView {
    /**
     * get Friend list Success
     */
    fun getFriendListSuccess(
            bookmarkResult: FriendListResponse?,
            commonResult: FriendListResponse,
            hotResult: HotKeyResponse
    )

    /**
     * get Friend list Failed
     */
    fun getFriendListFailed(errorMessage: String?)

    /**
     * get Friend list data size equal zero
     */
    fun getFriendListZero()
}