package com.fabiansuarez.financeapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.fabiansuarez.financeapp.R
import com.fabiansuarez.financeapp.databinding.ActivityAccountListBinding
import com.fabiansuarez.financeapp.viewmodels.AccountListActivityViewModel

class AccountListActivity : AppCompatActivity() {

    lateinit var binding: ActivityAccountListBinding
    lateinit var viewModel: AccountListActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_account_list)
        viewModel = ViewModelProvider(this)[AccountListActivityViewModel::class.java]


        binding.viewModel = viewModel

        viewModel.loadFakeData()
        viewModel.refreshData()

    }


}