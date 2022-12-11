package com.elowis.cafeteria

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

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
            val user_name = et_user_name.text.toString();
            var password = et_password.text.toString();
            var intentValue = intent.getStringExtra("Password")
             findViewById<TextView>(R.id.textView6).apply {
                text = intentValue.toString()
            }

            var text = findViewById(R.id.textView6) as TextView
            if (password.equals("")){
                Toast.makeText(this@LoginActivity, "Introdueix una Contrassenya", Toast.LENGTH_LONG).show()
            }
            if (password.equals(password)){
                var welcome = "Benvingut " + user_name
                Toast.makeText(this@LoginActivity,  welcome, Toast.LENGTH_LONG).show()
                startActivity(Intent(this, MainActivity::class.java))
            }
            else {
                Toast.makeText(this@LoginActivity,  "Contrassenya o Usuari Incorrecte", Toast.LENGTH_LONG).show()
            }

        }
    }
}