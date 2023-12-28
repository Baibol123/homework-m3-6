package com.example.homework_m3_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_6.databinding.ItemContactBinding

class MainActivity : AppCompatActivity() {
    private lateinit var itemContacts: RecyclerView
    private val contact = java.util.ArrayList<Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val contactAdapter = ContactAdapter(loadData(contact)!!)
        itemContacts.adapter = contactAdapter
    }
    private lateinit var binding: ItemContactBinding

    private fun initView() {
        itemContacts = findViewById<RecyclerView>(R.id.rv_contact)

    }

    private fun loadData(contacts: ArrayList<Contact>): ArrayList<Contact>? {
        contacts.add(Contact("Bakyt", "Orozbaev"))
        contacts.add(Contact("Rahmonberdi", "Zholdoshev"))
        contacts.add(Contact("Samat", "Yuldashev"))
        contacts.add(Contact("Kurmanbek", "Askarov"))
        contacts.add(Contact("Adylet", "Shermatov"))
        contacts.add(Contact("Kanat", "Baltabaev"))
        contacts.add(Contact("Myrzakan", "Zhoroev"))
        contacts.add(Contact("Djoomart", "Omorov"))
        contacts.add(Contact("Adis", "Abdullaev"))
        contacts.add(Contact("Asilbek", "Aliev"))
        contacts.add(Contact("Dilara", "Usmanova"))
        contacts.add(Contact("Altinay", "Aytmatova"))
        contacts.add(Contact("Leila", "Mamatalieva"))
        contacts.add(Contact("Jyrgal", "Abdulova"))
        contacts.add(Contact("Kalima", "Temirova"))
        contacts.add(Contact("Ayjan", "Ergasheva"))
        return contacts
    }

}