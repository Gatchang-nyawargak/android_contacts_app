package com.akirachix.mycontacts.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Contacts")
data class Contact(
    @PrimaryKey (autoGenerate = true)var contactId: Int,
    var name: String,
    var phonNember: String,
    var email: String,
    var avatar: String
)