package com.example.frienzy

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.frienzy.Fragments.HomeFragment
import com.example.frienzy.Fragments.ProfileFragment
import com.example.frienzy.databinding.ActivityHomeBinding


@Suppress("UNREACHABLE_CODE")
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomBar= findViewById<BottomNavigationView>(R.id.)
        bottomBar.setOnItemSelectedListener {menuItem ->
            if(menuItem.itemId == R.id. nav_guard){
                inflateFragment(GuardFragment.newInstance())
            }else if(menuItem.itemId == R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }else if(menuItem.itemId == R.id.nav_dashboard){
                inflateFragment(DashboardFragment.newInstance())
            }else if(menuItem.itemId==R.id.nav_profile){
                inflateFragment(ProfileFragment.newInstance())
            }
            true





        }
        bottomBar.selectedItemId=R.id.nav_home




    }



}

