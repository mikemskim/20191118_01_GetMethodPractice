package com.tj.a20191118_01_getmethodpractice.utils

import android.content.Context

class ContextUtil {

    companion object {

//        메모장의 파일 이름에 대응되는 개념.
        val prefName = "PracticePrefference"

//        사용자의 아이디를 저장하는 항목 이름
        val USER_ID = "USER_ID"
        val ISREMEMBER = "ISREMEMBER"
        val USER_TOKEN = "USER_TOKEN" // 사용자의 고유값(토큰값)을 저장하는 항목 이름

        fun setUserId(context: Context, userId:String) {
//            메모장 파일이름(PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//            메모장에 내용을 작성하고 저장하는 부분
            pref.edit().putString(USER_ID, userId).apply()
        }

        fun getUserId(context: Context) : String {
            //            메모장 파일이름(PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            return pref.getString(USER_ID, "")!!
        }

        fun setIsRemember(context: Context, isRemember:Boolean) {
//            메모장 파일이름(PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//            메모장에 내용을 작성하고 저장하는 부분
            pref.edit().putBoolean(ISREMEMBER, isRemember).apply()
        }

        fun getIsRemember(context: Context) : Boolean {
            //            메모장 파일이름(PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            return pref.getBoolean(ISREMEMBER, false)!!
        }

        fun setUserToken(context: Context, userToken:String) {
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString(USER_TOKEN, userToken).apply()
        }

        fun getUserToken(context: Context) : String {
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(USER_TOKEN, "")!!
        }
    }
}