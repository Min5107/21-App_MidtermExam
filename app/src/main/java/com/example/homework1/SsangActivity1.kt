package com.example.homework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ssang.*
import kotlinx.android.synthetic.main.ssang1.*

class SsangActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssang1)

        val fimg = intent.getIntExtra("fimg", 0)
        val fscript = intent.getStringExtra("fScript")
        ssang_image1.setImageResource(intent.getIntExtra("fimg", 0))
        ssang_text1.setText(intent.getStringExtra("fScript"))
    }
}
