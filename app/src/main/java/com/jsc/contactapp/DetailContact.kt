package com.jsc.contactapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsc.contactapp.databinding.ActivityDetailContactBinding

class DetailContact : AppCompatActivity() {

    private lateinit var binding: ActivityDetailContactBinding
    private var imageLarge = ""
    var fullname = ""
    var bod = ""
    var gender = ""
    var email = ""
    var tlp = ""
    val hp = ""
    var address = ""
    var longlat = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClose.setOnClickListener {
            onBackPressed()
        }

        binding.btnDelete.setOnClickListener {
            val hm = Intent(this, ListContact::class.java)
            hm.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            hm.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(hm)
        }
    }

    override fun onBackPressed() {
        onBackPressed()
        super.onBackPressed()
    }
}