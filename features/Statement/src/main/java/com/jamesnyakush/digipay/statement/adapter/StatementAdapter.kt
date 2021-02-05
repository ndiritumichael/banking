package com.jamesnyakush.digipay.statement.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamesnyakush.digipay.data.db.entity.StatementModel
import com.jamesnyakush.digipay.statement.R
import kotlinx.android.synthetic.main.item_statement.view.*


class StatementAdapter(
    val statement: List<StatementModel>
) : RecyclerView.Adapter<StatementAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_statement, parent, false)
        )
    }

    override fun getItemCount() = statement.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val statement = statement[position]

        holder.itemView.apply {
            statement_amount.text = statement.amount
            statement_level.text = statement.level
            statement_transid.text = statement.transactionId
            statement_time.text = statement.transactionTime
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}