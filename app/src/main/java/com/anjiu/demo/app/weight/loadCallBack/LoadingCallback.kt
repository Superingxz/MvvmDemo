package com.anjiu.demo.app.weight.loadCallBack

import android.content.Context
import android.view.View
import com.anjiu.demo.R
import com.kingja.loadsir.callback.Callback


class LoadingCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_loading
    }

    override fun onReloadEvent(context: Context?, view: View?): Boolean {
        return true
    }
}