package com.jsc.contactapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jsc.contactapp.databinding.ListUserBinding
import com.jsc.contactapp.model.PersonModel

class ListContactAdapter(private val userList: List<PersonModel>) :
    RecyclerView.Adapter<ListContactAdapter.ViewHolder>() {

    inner class ViewHolder(val itemBinding: ListUserBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListContactAdapter.ViewHolder {
        val view = ListUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListContactAdapter.ViewHolder, position: Int) {
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