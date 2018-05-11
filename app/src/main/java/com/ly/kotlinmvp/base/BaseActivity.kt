package com.ly.kotlinmvp.base

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.ly.kotlinmvp.presenter.BasePresenter


/**
 * @Package com.ly.kotlinmvp.base
 * @Description: 基础baseActivity
 * @author ly
 * @date 2018/5/11 15:57
 * @version V1.0
 */
abstract class BaseActivity<V, T : BasePresenter<V>> : FragmentActivity() {
    var presenter: T? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    abstract fun initPresenter(): T;

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView();
        presenter = null;
    }
}