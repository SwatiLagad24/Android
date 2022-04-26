package com.example.viewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding//
   // var product = Product("Demo Product Title", R.mipmap.ic_launcher, 12345.56F)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSetName.setOnClickListener {
            binding.txtName.text = binding.edtName.text.toString()
            //setProductToViews()
          //  binding.product = product
        }
    }
}