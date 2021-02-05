package com.jamesnyakush.digipay.statement.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jamesnyakush.digipay.core.toast
import com.jamesnyakush.digipay.data.db.entity.StatementModel
import com.jamesnyakush.digipay.statement.R
import com.jamesnyakush.digipay.statement.adapter.StatementAdapter
import kotlinx.android.synthetic.main.statement_list_fragment.*


class StatementList : Fragment(R.layout.statement_list_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        full_statement.setOnClickListener {
            context?.toast("Good Things  On  The way")
        }

        mini_statement.setOnClickListener {
            context?.toast("Good Things  On  The way")
        }

        val statement = listOf(
            StatementModel("100", "3", "NGH466", "12:00"),
            StatementModel("100", "3", "NGH466", "12:00"),
            StatementModel("100", "3", "NGH466", "12:00"),
            StatementModel("100", "3", "NGH466", "12:00")
        )

        recyclerview_members.apply {
            layoutManager = LinearLayoutManager(context)
            hasFixedSize()
            adapter = StatementAdapter(statement)
        }
    }
}