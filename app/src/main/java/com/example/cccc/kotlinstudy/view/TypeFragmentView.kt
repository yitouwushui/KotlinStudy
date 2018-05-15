package  com.example.cccc.kotlinstudy.view

import com.example.cccc.kotlinstudy.bean.TreeListResponse

/**
 * Type Fragment View interface
 */
interface TypeFragmentView {
    /**
     * get Type list Success
     */
    fun getTypeListSuccess(result: TreeListResponse)

    /**
     * get Type list Failed
     */
    fun getTypeListFailed(errorMessage: String?)

    /**
     * get Type list data size equal zero
     */
    fun getTypeListZero()
}