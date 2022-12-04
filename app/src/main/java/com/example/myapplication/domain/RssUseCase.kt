package com.example.myapplication.domain

class RssUseCase (private val repository: SourceRss) {

        fun execute(name:String, url:String){
            repository.saveRss(url, name)
        }

        data class SaveRss(val url:String, val name:String)
    }
