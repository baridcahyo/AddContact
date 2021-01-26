package com.jsc.contactapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsc.contactapp.databinding.ActivityListContactBinding

class ListContact : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    private var userLinearLayout = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
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