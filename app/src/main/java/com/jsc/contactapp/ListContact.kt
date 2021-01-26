package com.jsc.contactapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsc.contactapp.databinding.ActivityListContactBinding

class ListContact : AppCompatActivity() {

    private lateinit var binding: ActivityListContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val da = Intent(this, AddContact::class.java)
            startActivity(da)
        }
    }
}