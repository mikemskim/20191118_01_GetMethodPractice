package com.tj.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    var mContext = this

    abstract fun setupEvent()
    abstract fun setValue()

}