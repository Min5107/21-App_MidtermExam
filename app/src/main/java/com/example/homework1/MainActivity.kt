package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fristIn = Intent(this, TareaActivity::class.java)
        val secondIn = Intent(this, FoodActivity::class.java)
        val thirdIn = Intent(this, EnjoyActivity::class.java)


        val m_btn0: Button = findViewById(R.id.m_btn)
        m_btn0.setOnClickListener {
            startActivity(fristIn)

        }
        val m_btn2: Button = findViewById(R.id.m_btn2)
        m_btn2.setOnClickListener {
            startActivity(secondIn)
        }

        val m_btn1: Button = findViewById(R.id.m_btn1)

        m_btn1.setOnClickListener {
            startActivity(thirdIn)
        }
    }
}