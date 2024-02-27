package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirsAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity
import com.example.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnSaludar.setOnClickListener { navigateToSaludar() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar() {
        val intent = Intent(this, FirsAppActivity::class.java)
        startActivity(intent)
    }
}