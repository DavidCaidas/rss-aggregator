package com.example.myapplication.data

import com.example.myapplication.data.local.xml.XmlLocalDataSource
import com.example.myapplication.domain.UserRssRepository

class RssDataRepository (private val source: XmlLocalDataSource): UserRssRepository{

    override fun saveRss(url: String, name: String) {
        source.saveRss(url, name)
    }
}