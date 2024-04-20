package com.example.proyectobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.login)

        val btn_iniciar : Button = findViewById(R.id.btn_iniciar)

        btn_iniciar.setOnClickListener {
            val intent = Intent(this,Agendar::class.java).apply {

            }
            startActivity(intent)
        }

    }
}