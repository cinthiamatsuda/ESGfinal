package br.com.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnAdulto= findViewById<Button>(R.id.button3)

        btnAdulto.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
    }
}