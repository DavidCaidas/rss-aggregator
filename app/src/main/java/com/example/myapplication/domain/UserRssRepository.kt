package com.example.myapplication.domain


interface UserRssRepository {
    fun saveRss(url:String, name:String)
}