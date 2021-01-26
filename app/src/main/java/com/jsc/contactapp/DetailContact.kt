package com.jsc.contactapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsc.contactapp.databinding.ActivityDetailContactBinding

class DetailContact : AppCompatActivity() {

    private lateinit var binding: ActivityDetailContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}