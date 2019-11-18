package com.tj.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupEvent()
        setValue()
    }

    override fun setupEvent() {

        loginBtn.setOnClickListener {

            if(rememberIdCheckBox.isChecked) {
                Toast.makeText(mContext, "ID를 저장해야 합니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(mContext, "ID를 저장 안함", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun setValue() {
    }

}
