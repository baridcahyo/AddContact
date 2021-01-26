package com.jsc.contactapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsc.contactapp.adapter.AddContactAdapter
import com.jsc.contactapp.api.ApiClient
import com.jsc.contactapp.databinding.ActivityAddContactBinding
import com.jsc.contactapp.model.PersonModel
import com.jsc.contactapp.model.ResponseModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AddContact : AppCompatActivity() {

    private lateinit var binding: ActivityAddContactBinding
    var responseData = ArrayList<ResponseModel>()
    val personModel = ArrayList<PersonModel>()
    var dataList = ArrayList<PersonModel>()

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPerson

        binding.rvPerson.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        binding.rvPerson.adapter = AddContactAdapter(dataList.toMutableList())
        getData()

        binding.btnClose.setOnClickListener {
            onBackPressed()
        }

        binding.look.setOnClickListener {
            val det = Intent(this, DetailContact::class.java)
            startActivity(det)
        }
    }

    private fun getData() {
        val call: Call<List<ResponseModel>> = ApiClient.getClient.getRandomUser()
        call.enqueue(object : Callback<List<ResponseModel>> {

            override fun onFailure(call: Call<List<ResponseModel>>, t: Throwable) {
                println("gagal -> " + t.message.toString())
            }

            override fun onResponse(
                call: Call<List<ResponseModel>>,
                response: Response<List<ResponseModel>>
            ) {
                println("masuk datanya: " + response.body().toString())
                println("responData: " + responseData.size.toString())
                binding.rvPerson.adapter?.notifyDataSetChanged()
            }
        })
    }

    override fun onBackPressed() {
        onBackPressed()
        super.onBackPressed()
    }
}