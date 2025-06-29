package com.o7.practiceproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class implicitactivity : AppCompatActivity() {
    var textView: TextView?=null
    var getintData=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicitactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView=findViewById(R.id.tvdataa)
        var getData=intent.getStringExtra("data")
        getintData=intent.getIntExtra("ghghgh",0)


        println(getData)
        textView?.setText(getData)

        findViewById<TextView>(R.id.tvdataa).setText(getData)
        findViewById<Button>(R.id.btnurl1).setOnClickListener {
            var intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://o7services/.com/"))
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            var intent= Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:9876543210"))
            startActivity(intent)
        }
    }
}