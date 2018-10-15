package com.swarawan.binar9

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.swarawan.binar9.preference.PreferenceConfig
import com.swarawan.binar9.preference.PreferenceConstant

/**
 * Created by Rio Swarawan on 10/15/18.
 */
class LauncherActivity : AppCompatActivity() {

    private lateinit var preferenceConfig: PreferenceConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        preferenceConfig = PreferenceConfig(this@LauncherActivity)
        val isLoggedIn = preferenceConfig.getBoolean(PreferenceConstant.isLoggedIn)
        val intent: Intent = when {
            isLoggedIn -> Intent(this@LauncherActivity, MainActivity::class.java)
            else -> Intent(this@LauncherActivity, LoginActivity::class.java)
        }

        // delay 3 detik kemudian startActivity
        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, 3 * 1000)
    }
}