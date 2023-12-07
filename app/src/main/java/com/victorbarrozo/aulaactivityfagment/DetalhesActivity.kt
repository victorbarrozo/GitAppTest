package com.victorbarrozo.aulaactivityfagment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetalhesActivity : AppCompatActivity() {
    lateinit var buttonFechar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.bnt_fechar)
        buttonFechar.setOnClickListener {
            finish()
        }
    }
}