package com.o7.practiceproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_spinner : AppCompatActivity() {
    lateinit var binding: ActivitySpinnerBinding
    var spinnervalues = mutableListOf("first", "second", "third")
    lateinit var arrayAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,spinnervalues)
        binding.spDynamic.adapter=arrayAdapter
        binding.spDynamic.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var selectedItem=binding.spDynamic.selectedItem as String
                Toast.makeText(this@activity_spinner, "$selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        binding.spStatic.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var selectedItem=binding.spStatic.selectedItem as String
                Toast.makeText(this@activity_spinner, "$selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



    }
}