package com.akirachix.mycontacts.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import com.akirachix.mycontacts.R
import com.akirachix.mycontacts.databinding.ActivityAddContactBinding
import com.akirachix.mycontacts.model.Contact
import com.akirachix.mycontacts.viewmodel.ContactsViewModel

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener {
            validateContact()
        }
    }

    fun validateContact() {
        val name = binding.etName.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (name.isBlank()) {
            error = true
            binding.etName.error = getString(R.string.name_required)
        }

        if (phone.isBlank()) {
            error = true
            binding.etPhoneNumber.error = getString(R.string.phone_required)
        }

        if (email.isBlank()) {
            error = true
            binding.etEmail.error = getString(R.string.email_required)
        }




        if (!error){

            val newContact = Contact(contactId = 0, name=name,email=email, phonNember = phone, avatar = "")
            contactsViewModel.saveContact(newContact)
        }



    }
}