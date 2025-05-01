package com.example.projetoportflio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class telaProjetos : AppCompatActivity() {

    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_projetos)

        val textView7 = findViewById<TextView>(R.id.textView7)
        textView7.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://github.com/blougouras/navegandoTelas_androidStudio".toUri()
            startActivity(intent)
        }

        val textView8 = findViewById<TextView>(R.id.textView8)
        textView8.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://github.com/blougouras/appPortfolioAndoidStudio".toUri()
            startActivity(intent)
        }

        val textView9 = findViewById<TextView>(R.id.textView9)
        textView9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://github.com/blougouras/appAgenda".toUri()
            startActivity(intent)
        }

        val textView10 = findViewById<TextView>(R.id.textView10)
        textView10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://github.com/blougouras/appAPI".toUri()
            startActivity(intent)
        }

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
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