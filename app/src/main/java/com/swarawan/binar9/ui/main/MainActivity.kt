package com.swarawan.binar9.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.swarawan.binar9.R
import com.swarawan.binar9.ui.main.fragment.FragmentA

/**
 * Created by Rio Swarawan on 10/15/18.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        placeFragment()
    }

    private fun placeFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.frame, FragmentA())
                .commit()
    }
}