package com.example.workdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.workdatabinding.databinding.ActivityMainBinding

// using data binding in a Activity Class
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        /**
         * when a class want to use dataBinding we don't need setContentView , we need ***ActivityMainBinding***
         */
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        binding.tvName.text = "Abozar Raghibdoust"
//        binding.tvEmail.text = "abozar.raghibdoust@gmail.com"

        binding.contact = Contact("abo","araghibdoust@gmail.com")

        binding.handler = EventHandler(this)

        binding.imageUrl = "https://firebasestorage.googleapis.com/v0/b/flutterblocpattern.appspot.com/o/867791-826130-800.jpg?alt=media&token=21f95211-bb45-4ef0-afc0-abaf005b378d"
        Log.d("BaseActivity", "onCreate: ")
    }
}
