package com.akirachix.mycontacts.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mycontacts.databinding.ContactListItemBinding
import com.akirachix.mycontacts.model.Contact

class ContactsAdapter(val contactsList:List<Contact>):
RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
         var contact = contactsList[position]
        holder.binding.tvName.text = contact.name
        holder.binding.tvPhoneNumber.text = contact.phoneNumber
        holder.binding.tvEmail.text= contact.email
    }


}


class  ContactsViewHolder(var binding: ContactListItemBinding):
    RecyclerView.ViewHolder(binding.root){
      val tvName = binding.tvName
      val tvEmail =binding.tvEmail
      val tvPhoneNumber = binding.tvPhoneNumber
    }