package com.chachaup.iplant.auth.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chachaup.iplant.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide() //remove action bar
    }
}