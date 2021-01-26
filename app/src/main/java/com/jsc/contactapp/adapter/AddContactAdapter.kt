package com.jsc.contactapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jsc.contactapp.databinding.ListUserBinding
import com.jsc.contactapp.model.PersonModel

class AddContactAdapter(private val userList: List<PersonModel>) :
    RecyclerView.Adapter<AddContactAdapter.ViewHolder>() {

    inner class ViewHolder(val itemBinding: ListUserBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = ListUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AddContactAdapter.ViewHolder, position: Int) {
        with(holder) {
            with(userList[position]) {
                itemBinding.textFullName.text = email
            }
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}