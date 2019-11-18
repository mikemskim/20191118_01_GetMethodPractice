package com.tj.a20191118_01_getmethodpractice.datas

import org.json.JSONObject

class Category {

    var id = 0
    var title = ""
    var color = ""

    companion object {
        fun getCategoryFromJson(json:JSONObject) : Category {
            var category = Category()

            category.id = json.getInt("id")
            category.title = json.getString("title")
            category.color = json.getString("color")

            return category
        }
    }
}