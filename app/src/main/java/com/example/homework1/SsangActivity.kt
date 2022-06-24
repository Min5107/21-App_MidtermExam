package com.example.homework1

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ssang.*
import kotlinx.android.synthetic.main.tarea_recycle.*

class SsangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssang)
        val timg = intent.getIntExtra("timg",0)
       // val tScript = intent.getStringExtra("tScript")
        val tSscript = intent.getStringExtra("tSscript")
        // ssang_image.setImageResource(R.drawable.t_img1)
        ssang_image.setImageResource(intent.getIntExtra("timg", 0))
        //ssang_text.setText(intent.getStringExtra("tScript"))
        ssang_text.setText(intent.getStringExtra("tSscript"))







    }
}