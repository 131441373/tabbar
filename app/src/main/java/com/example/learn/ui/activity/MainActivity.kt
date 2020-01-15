package com.example.learn.ui.activity

import com.example.learn.R
import com.example.learn.base.BaseActivity
import com.example.learn.util.FragUtil
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    fun trans(pos:Int) {
        var trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.container, FragUtil.map(pos))
        trans.commit()
    }

    override fun initListener() {
        trans(0)//initial at 1

        tab_bar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab) {
                trans(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) { }

            override fun onTabSelected(tab: TabLayout.Tab) {
                trans(tab.position)
            }
        })
    }
}
