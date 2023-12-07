package com.victorbarrozo.aulaactivityfagment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAbrir = findViewById(R.id.btn_abrir)
        buttonAbrir.setOnClickListener {

            val intent = Intent(
                this,
                DetalhesActivity::class.java)
            startActivity(intent)
        }
    }
}