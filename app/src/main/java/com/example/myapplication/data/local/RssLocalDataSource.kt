package com.example.myapplication.data.local

interface RssLocalDataSource {
    fun createRss(url: String, name: String)
}
