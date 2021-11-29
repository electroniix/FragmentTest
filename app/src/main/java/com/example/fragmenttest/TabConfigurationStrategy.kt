package com.example.fragmenttest

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabConfigurationStrategy : TabLayoutMediator.TabConfigurationStrategy {
    override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
        tab.text = "Tab " + (position+1)
    }

}