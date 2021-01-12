package com.example.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPassword = findViewById(R.id.etPassword)
        etUsername = findViewById(R.id.etUsername)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
        val username = etUsername.getText().toString()
        val password = etPassword.getText().toString()
        if (username == "softwarica" && password == "coventry") {
            Toast.makeText(
                this@MainActivity,
                "User Succesfully Logged in",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this, Home_Activity::class.java)
            startActivity(intent)
        } else {
            etUsername.setText("");
            etPassword.setText("");
            etUsername.requestFocus()
            Toast.makeText(this@MainActivity, "Invalid Username or Password", Toast.LENGTH_LONG).show()
        }
        }
    }
}