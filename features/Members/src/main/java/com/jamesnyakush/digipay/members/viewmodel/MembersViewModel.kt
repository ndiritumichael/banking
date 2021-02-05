package com.jamesnyakush.digipay.members.viewmodel

import androidx.lifecycle.ViewModel
import com.jamesnyakush.digipay.data.db.entity.MembersModel

class MembersViewModel : ViewModel() {

    val members = listOf(
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival"),
        MembersModel("james", "Maufestival")
    )
}
