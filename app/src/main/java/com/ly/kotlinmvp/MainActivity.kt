package com.ly.kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ly.kotlinmvp.base.BaseActivity
import com.ly.kotlinmvp.presenter.impl.MainPresenterImpl
import com.ly.kotlinmvp.view.MainView

class MainActivity : BaseActivity<MainView, MainPresenterImpl>(), MainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onGetDataSucess() {
    }

    override fun initPresenter(): MainPresenterImpl {
        return MainPresenterImpl();
    }


}
