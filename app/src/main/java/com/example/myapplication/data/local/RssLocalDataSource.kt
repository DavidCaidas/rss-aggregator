package com.example.myapplication.data.local

interface RssLocalDataSource {
    fun saveRss(url: String, name: String)
}
