package com.anjiu.demo.ui.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import com.anjiu.demo.R
import com.anjiu.demo.app.base.BaseFragment
import com.anjiu.demo.app.ext.init
import com.anjiu.demo.app.ext.initMain
import com.anjiu.demo.app.ext.interceptLongClick
import com.anjiu.demo.app.ext.setUiTheme
import com.anjiu.demo.databinding.FragmentMainBinding
import com.anjiu.demo.viewmodel.state.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * 时间　: 2019/12/27
 * 作者　: hegaojian
 * 描述　:项目主页Fragment
 */
class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {

    override fun layoutId() = R.layout.fragment_main

    override fun initView(savedInstanceState: Bundle?) {
        //初始化viewpager2
        mainViewpager.initMain(this)
        //初始化 bottomBar
        mainBottom.init{
            when (it) {
                R.id.menu_main -> mainViewpager.setCurrentItem(0, false)
            }
        }
        mainBottom.interceptLongClick(R.id.menu_main)
    }

    override fun createObserver() {
        appViewModel.appColor.observe(viewLifecycleOwner, Observer {
            setUiTheme(it, mainBottom)
        })
    }
}