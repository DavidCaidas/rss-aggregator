package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupNavigation()
    }

    fun setupBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.let {
            setContentView(it.root)
        }
    }

    fun setupNavigation(){
        findViewById<BottomNavigationView>(R.id.bottom_menu).setOnItemSelectedListener {
            when(it.itemId){
                R.id.to_rss_feed_item -> navigateToRssFeed()
                R.id.to_rss_manager_item -> navigateToRssManager()
                R.id.to_your_profile_item -> navigateToProfile()
            }
            true
        }

    }

    fun navigateToRssFeed(){
        findNavController(R.id.fragment_container_view).navigate(NavGraphDirections.actionToRssFeed())
    }

    fun navigateToRssManager(){
        findNavController(R.id.fragment_container_view).navigate(NavGraphDirections.actionToRssManager())
    }

    fun navigateToProfile(){
        findNavController(R.id.fragment_container_view).navigate(NavGraphDirections.actionToProfile())
    }

}