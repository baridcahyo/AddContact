package com.jsc.contactapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsc.contactapp.databinding.ActivityAddContactBinding

class AddContact : AppCompatActivity() {

    private lateinit var binding: ActivityAddContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClose.setOnClickListener {
            onBackPressed()
        }

        binding.look.setOnClickListener {
            val det = Intent(this, DetailContact::class.java)
            startActivity(det)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}