package com.example.myapplication.data.local.xml

import android.content.SharedPreferences
import com.example.myapplication.commons.serializer.KSerializer
import com.example.myapplication.data.local.RssLocalDataSource
import com.example.myapplication.domain.Models.Rss

class XmlLocalDataSource (sharedPreferences: SharedPreferences, private val serializer: KSerializer) : RssLocalDataSource{

    private val editor = sharedPreferences.edit()

    override fun saveRss(url: String, name: String) {
        editor.putString(url, serializer.toJson(Rss(name, url), Rss::class.java))
        editor.apply()
    }

}