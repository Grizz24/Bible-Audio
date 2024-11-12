package com.example.bible

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var image1 : ImageView
    private lateinit var image2 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        image1 = findViewById(R.id.king_james)
        image1.setOnClickListener {
            val intent = Intent(this@MainActivity, PdfView1::class.java)
            startActivity(intent)
        }

        image2 = findViewById(R.id.basic_bible)
        image2.setOnClickListener {
            val intent = Intent(this@MainActivity, PdfView2::class.java)
            startActivity(intent)


        }
    }
}