package com.tj.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvent()
        setValue()
    }

    override fun setupEvent() {
    }

    override fun setValue() {
    }
}
