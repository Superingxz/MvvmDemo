package com.anjiu.demo.app.weight.loadCallBack

import com.anjiu.demo.R
import com.kingja.loadsir.callback.Callback


class ErrorCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_error
    }

}