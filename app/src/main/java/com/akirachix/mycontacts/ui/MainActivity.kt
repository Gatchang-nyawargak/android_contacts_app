package com.akirachix.mycontacts.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding
import com.akirachix.mycontacts.model.Contact

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        displayContacts()
    }

    override fun onResume() {
        super.onResume()
        binding.fabSaveContact.setOnClickListener{
            startActivity(Intent(this,AddContactActivity::class.java))
        }
    }
   fun displayContacts(){

//       val contactsAdapter = ContactsAdapter(contactsList)
//       binding.rvContacts.adapter = contactsAdapter
   }
}