package com.elowis.cafeteria

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {
            // Reset dels valors
            et_user_name.setText("")
            et_password.setText("")
        }

        // Botó Submit
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            var password = et_password.text;
            if (password.equals("")){
                Toast.makeText(this@LoginActivity, "Introdueix una Contrassenya", Toast.LENGTH_LONG).show()
            }
            else{
                var welcome = "Benvingut " + user_name
                Toast.makeText(this@LoginActivity,  welcome, Toast.LENGTH_LONG).show()
                startActivity(Intent(this, MainActivity::class.java))
            }

        }
    }
}