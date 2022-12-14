package com.example.myapplication.data.remote.api

import org.simpleframework.xml.*
import java.util.*

@Root(name = "rss", strict = false)

data class RssApiModel @JvmOverloads constructor(

    @field:ElementList(name = "item", inline = true, required = false)
    @param:ElementList(name = "item", inline = true, required = false)

    @field:Path("channel")
    @param:Path("channel")

    var items: List<ItemApiModel>? = null

)

@Root(name = "item", strict = false)

data class ItemApiModel @JvmOverloads constructor(

    @field:Path("title")
    @param:Path("title")

    @field:Text(required = false)
    @param:Text(required = false)

    var title: String? = null

)