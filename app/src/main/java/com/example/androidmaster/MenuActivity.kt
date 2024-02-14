package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirsAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludar.setOnClickListener{navigateToSaludar()}
        btnImcApp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar(){
        val intent = Intent(this,FirsAppActivity::class.java)
        startActivity(intent)
    }
}