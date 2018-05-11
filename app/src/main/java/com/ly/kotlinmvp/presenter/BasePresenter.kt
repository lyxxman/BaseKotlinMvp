package com.ly.kotlinmvp.presenter

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.ref.Reference
import java.lang.ref.WeakReference


/**
 * @Package main.ly.com.basekotlinmvp.presenter
 * @Description: 基础presenter类
 * @author ly
 * @date 2018/4/27 14:55
 * @version V1.0
 */
open class BasePresenter<T> {
    //保存view
    var mViewRef: Reference<T>? = null
    //
    var mCompositeDisposable: CompositeDisposable? = null

    fun attachView(view: T?) {
        mCompositeDisposable = CompositeDisposable()
        mViewRef = WeakReference<T>(view)
    }

    protected fun getView(): T? {
        return mViewRef?.get();
    }

    /**
     * 是否已经添加过view
     */
    fun isViewAttached(): Boolean {
        return mViewRef != null && mViewRef?.get() != null;
    }

    //清除请求
    open fun detachView() {
        if (mCompositeDisposable?.isDisposed!!) {
            mCompositeDisposable?.clear();
        }
    }

    //添加一个调用
    fun addSubscription(disposable: Disposable) {
        mCompositeDisposable?.add(disposable)
    }
}