package com.fabiansuarez.financeapp.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.fabiansuarez.financeapp.R
import com.fabiansuarez.financeapp.databinding.ItemAccountBinding
import com.fabiansuarez.financeapp.model.entities.Account

class AccountAdapter(private var dataSet: ArrayList<Account>) :
    RecyclerView.Adapter<AccountAdapter.ViewHolder>() {


    class ViewHolder(private val binding: ItemAccountBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(myAccount: Account) {
            binding.account = myAccount
        }

    }

    fun refresh(newDataSet: ArrayList<Account>) {
        dataSet = newDataSet
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val binding: ItemAccountBinding = DataBindingUtil.inflate(
            inflate,
            R.layout.item_account,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}