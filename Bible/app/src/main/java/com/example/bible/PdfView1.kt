package com.example.bible

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.github.barteksc.pdfviewer.PDFView

class PdfView1 : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    private lateinit var pdfView1: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pdf_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        pdfView = findViewById(R.id.pdfView)
        pdfView.fromAsset("bible.pdf").load()



    }
}