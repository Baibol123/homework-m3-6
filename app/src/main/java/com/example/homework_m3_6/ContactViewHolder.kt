package com.example.homework_m3_6

import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_6.databinding.ItemContactBinding

class ContactsViewHolder(val binding: ItemContactBinding ) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(contactName: String, contactSurname: String) {
        val fullName = "$contactName $contactSurname"
        binding.textViewContactName.text = fullName
        if (contactName.length > 1 && contactSurname.length > 1) {
            val initials = "${contactName[0]}${contactSurname[0]}"
            binding.textViewContact.text = initials
        }
    }
}
