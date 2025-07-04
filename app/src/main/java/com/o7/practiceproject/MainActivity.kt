package com.o7.practiceproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            Toast.makeText(this, "on click message displayed", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, Edittext_fetching::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btnImplicit).setOnClickListener {
            var intent = Intent(this, implicitactivity ::class.java)
                .putExtra("data", "My Data")
                 startActivity(intent)
        }
        findViewById<Button>(R.id.btnConstraintScreen).setOnClickListener {
            var intent = Intent(this, constraint ::class.java)
                .putExtra("data", "My Data")
            startActivity(intent)
        }
    }
}