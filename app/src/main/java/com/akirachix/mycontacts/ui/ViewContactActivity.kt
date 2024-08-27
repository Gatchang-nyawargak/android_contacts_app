package com.akirachix.mycontacts.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mycontacts.R
import com.akirachix.mycontacts.databinding.ActivityMainBinding
import com.akirachix.mycontacts.databinding.ActivityViewContactBinding
import com.akirachix.mycontacts.viewmodel.ContactsViewModel

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    val contactViewModel: ContactsViewModel by viewModels()
    var contactId= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.extras!=null){
            contactId = intent.getIntExtra("CONTACT_ID",0)
        }

        else{
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        contactViewModel.getContactById(contactId).observe(this){ contact ->
            binding.tvConctactName.text = contact.name
            binding.tvContactPhone.text = contact.phoneNumber
            binding.tvContactEmail.text = contact.email

        }
    }
}