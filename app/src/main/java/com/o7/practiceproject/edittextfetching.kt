package com.o7.practiceproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class edittextfetching : AppCompatActivity() {
    lateinit var binding : ActivityEdittextfetchingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityEdittextfetchingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.click.setonclicklistener{
            if (binding.main2.text.tostring().isNullOrEmpty())
                binding.main2.error="enter correct name"
        }else{
            Toast.makeText(this,binding.main2.text.tostring(), Toast.LENGTH_SHORT).show()
        }
    }
}