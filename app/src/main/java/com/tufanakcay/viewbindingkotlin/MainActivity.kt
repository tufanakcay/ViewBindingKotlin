package com.tufanakcay.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tufanakcay.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var textView : TextView

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.textView.text = "On Create Altındaki Kod"
        //textView = findViewById<TextView>(R.id.textView)

    }


    fun ismiDegistir(view : View) {
        //textView.text = "Merhaba Kotlin"
        binding.textView.text = "Hello Kotlin"
    }
}