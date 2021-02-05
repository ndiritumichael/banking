package com.jamesnyakush.digipay.members.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.jamesnyakush.digipay.members.R
import com.jamesnyakush.digipay.members.adapter.MembersAdapter
import com.jamesnyakush.digipay.members.viewmodel.MembersViewModel
import kotlinx.android.synthetic.main.member_fragment.*

/**
 *  Member Fragment
 *
 */
class Member : Fragment(R.layout.member_fragment) {

    private lateinit var viewModel: MembersViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MembersViewModel::class.java)

        val members = viewModel.members

        recyclerview_members.apply {
            layoutManager = LinearLayoutManager(context)
            hasFixedSize()
            adapter = MembersAdapter(members)
        }
    }
}