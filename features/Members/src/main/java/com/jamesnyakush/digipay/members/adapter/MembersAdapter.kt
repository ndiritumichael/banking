package com.jamesnyakush.digipay.members.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.digipay.data.db.entity.MembersModel
import com.jamesnyakush.digipay.members.R
import kotlinx.android.synthetic.main.item_members.view.*

class MembersAdapter(
    val members: List<MembersModel>
) : RecyclerView.Adapter<MembersAdapter.MembersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MembersViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_members, parent, false)
    )

    override fun getItemCount() = members.size

    override fun onBindViewHolder(holder: MembersViewHolder, position: Int) {
        val member = members[position]

        holder.itemView.apply {
            username.text = member.username
            referral_code.text = member.referralcode
        }
    }

    class MembersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}