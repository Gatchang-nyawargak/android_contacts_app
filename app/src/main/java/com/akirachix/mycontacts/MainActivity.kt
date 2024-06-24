package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        displayContacts()
    }
   fun displayContacts(){
       var contact1 = Contact("Joy","0843768439298","joy@gmail.com","")
       var contact2 = Contact("Warga","0741924309","warga@gmail.com","")
       var contact3 = Contact("nairat","01553266347","nairat@gmail.com","")
       var contact4 = Contact("Hawa","0843768439298","hawa@gmail.com","")
       var contact5 = Contact("Linet","0843768439298","linet@gmail.com","")
       var contact6 = Contact("Emmy","0843768439298","emmy@gmail.com","")
       var contact7 = Contact("Fred","0843768439298","fred@gmail.com","")
       var contact8 = Contact("Warga","0741924309","warga@gmail.com","")
       var contact9 = Contact("nairat","01553266347","nairat@gmail.com","")
       var contact10= Contact("Hawa","0843768439298","hawa@gmail.com","")
       var contact11 = Contact("Linet","0843768439298","linet@gmail.com","")
       var contact12 = Contact("Emmy","0843768439298","emmy@gmail.com","")
       var contact13 = Contact("Fred","0843768439298","fred@gmail.com","")
       val contactsList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
       val contactsAdapter = ContactsAdapter(contactsList)
       binding.rvContacts.adapter = contactsAdapter
   }
}