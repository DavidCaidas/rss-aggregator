package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.data.remote.api.ApiClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.util.Log


class MainActivity : AppCompatActivity() {

    val apiClient = ApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            try {
                val model = apiClient.getRss("https://e00-marca.uecdn.es/rss/futbol/sevilla.xml")
                Log.d("@dev", "model:$model")
            } catch (ex: java.lang.Exception) {
                Log.d("@dev-e", ex.message!!)
            }
        }
    }
}