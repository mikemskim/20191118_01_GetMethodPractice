package com.tj.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tj.a20191118_01_getmethodpractice.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupEvent()
        setValue()
    }

    override fun setupEvent() {

        rememberIdCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->

//            연습문제
//            각각의 결과를 저장하고 상황에 맞는 토스트를 띄우자
//            앱을 다시 킬때 체크했던 결과를 이어서 보여주자.
            ContextUtil.setIsRemember(mContext, isChecked)
            if (isChecked) {
                Toast.makeText(mContext, "체크함", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(mContext, "체크안함", Toast.LENGTH_SHORT).show()
            }
        }
        loginBtn.setOnClickListener {

            if(rememberIdCheckBox.isChecked) {
                ContextUtil.setUserId(mContext, idEdt.text.toString())
                Toast.makeText(mContext, "ID를 저장했습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(mContext, "ID를 저장 안함", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun setValue() {
//        저장되어 있는 아이디가 뭔지?
        idEdt.setText(ContextUtil.getUserId(mContext))

        rememberIdCheckBox.isChecked = ContextUtil.getIsRemember(mContext)
    }

}
