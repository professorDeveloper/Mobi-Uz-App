package com.azmovhudstc.mobiuzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this,R.id.fragment_my).navigateUp()

    }
}