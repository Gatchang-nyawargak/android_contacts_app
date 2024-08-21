package com.akirachix.mycontacts.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding
import com.akirachix.mycontacts.model.Contact
import com.akirachix.mycontacts.viewmodel.ContactsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)

    }

    override fun onResume() {
        super.onResume()
        binding.fabSaveContact.setOnClickListener{
            startActivity(Intent(this,AddContactActivity::class.java))

            }
        contactsViewModel.getAllContacts().observe(this){contactList->
            displayContacts(contactList)
        }

    }
   fun displayContacts(contactList: List<Contact>){

       val contactsAdapter = ContactsAdapter(contactList, this)
       binding.rvContacts.adapter = contactsAdapter
   }
}