package com.swarawan.binar9.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.swarawan.binar9.ui.main.MainActivity
import com.swarawan.binar9.R
import com.swarawan.binar9.preference.PreferenceConfig
import com.swarawan.binar9.preference.PreferenceConstant
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var preferenceConfig: PreferenceConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        preferenceConfig = PreferenceConfig(this@LoginActivity)

        buttonLogin.setOnClickListener { checkLoginForm() }
    }

    private fun checkLoginForm() {
        val username = inputUsername.text.toString()
        val password = inputPassword.text.toString()

        when {
            username.isBlank() -> showMessage("Username tidak boleh kosong")
            password.isEmpty() -> showMessage("Password tidak boleh kosong")
            !username.equals("rioswarawan", true) -> showMessage("username tidak sesuai")
            !password.equals("12345678", true) -> showMessage("password tidak sesuai")
            else -> loginNow()
        }
    }

    private fun loginNow() {
        // simpan state login
        preferenceConfig.setBoolean(PreferenceConstant.isLoggedIn, true)

        // intent to main
        val intent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this@LoginActivity, msg, Toast.LENGTH_SHORT).show()
    }
}
