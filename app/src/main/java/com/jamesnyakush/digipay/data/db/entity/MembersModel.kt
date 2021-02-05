package com.jamesnyakush.digipay.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MembersModel(
    @PrimaryKey
    var username : String,
    var referralcode :String
)