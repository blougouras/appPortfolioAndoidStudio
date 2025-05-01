package com.example.projetoportflio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.net.toUri

class telaContatos : AppCompatActivity() {

    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_contatos)

        val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://www.linkedin.com/in/luizblougouras".toUri()
            startActivity(intent)
        }

        val textView6 = findViewById<TextView>(R.id.textView6)
        textView6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://github.com/blougouras".toUri()
            startActivity(intent)
        }



        button4 = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}