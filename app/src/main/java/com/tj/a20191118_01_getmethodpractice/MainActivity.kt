package com.tj.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tj.a20191118_01_getmethodpractice.datas.User
import com.tj.a20191118_01_getmethodpractice.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

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
        ServerUtil.getRequestMyInfo(mContext, object : ServerUtil.jsonResponseHandler {
            override fun onResponse(json: JSONObject) {
                Log.d("내정보응답",  json.toString())

                val data = json.getJSONObject("data")
                val user = data.getJSONObject("user")

                var me:User = User.getUserFromJson(user)

                loginIdTxt.text = me.login_id

                nameTxt.text = me.name
                phoneNumTxt.text = me.phone

            }

        })
    }
}
