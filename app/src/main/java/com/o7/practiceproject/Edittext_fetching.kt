package com.o7.practiceproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.o7.practiceproject.databinding.EdittextfetchingBinding

class Edittext_fetching : AppCompatActivity() {
    lateinit var binding: EdittextfetchingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = EdittextfetchingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.click.setOnClickListener {
            if (binding.main2.text.toString().isNullOrEmpty()) {
                binding.main2.error = "enter correct name"

            } else {
                Toast.makeText(this,binding.main2.toString(), Toast.LENGTH_SHORT).show()

            }

        }
    }
}
