package com.example.homework_m3_6

import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_6.databinding.ItemContactBinding

class ContactAdapter(val contactData: ArrayList<Contact>) : RecyclerView.Adapter<ContactsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactData[position]
        holder.onBind(contact.contactName, contact.contactSurname)
    }

    override fun getItemCount(): Int {
        return contactData.size
    }
}
