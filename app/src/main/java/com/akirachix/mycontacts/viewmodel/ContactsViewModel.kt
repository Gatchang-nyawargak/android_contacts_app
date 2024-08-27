package com.akirachix.mycontacts.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akirachix.mycontacts.model.Contact
import com.akirachix.mycontacts.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel: ViewModel() {
    val contactRepo = ContactsRepository()
    fun saveContact(contact: Contact){
        viewModelScope.launch {
            contactRepo.saveContact(contact)

        }
    }
    fun getAllContacts():LiveData<List<Contact>>{
        return contactRepo.getAllContacts()
    }
    fun getContactById(contactId:Int):LiveData<Contact>{
        return contactRepo.getContactById(contactId)
    }
}