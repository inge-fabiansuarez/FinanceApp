package com.fabiansuarez.financeapp.viewmodels

import androidx.lifecycle.ViewModel
import com.fabiansuarez.financeapp.view.adapters.AccountAdapter
import com.fabiansuarez.financeapp.model.entities.Account

class AccountListActivityViewModel : ViewModel() {

    private var accountsList: ArrayList<Account> = arrayListOf()
    var adapter: AccountAdapter = AccountAdapter(accountsList)

    fun refreshData() {
        adapter.refresh(accountsList)
    }

    fun loadFakeData() {
        accountsList.apply {
            add(Account(name = "Cuenta 1", balance = 2000000.0))
            add(Account(name = "Cuenta 2", balance = 2000000.0))
            add(Account(name = "Cuenta 3", balance = 2000000.0))
            add(Account(name = "Cuenta 4", balance = 2000000.0))
            add(Account(name = "Cuenta 5", balance = 2000000.0))
            add(Account(name = "Cuenta 1", balance = 2000000.0))
            add(Account(name = "Cuenta 2", balance = 2000000.0))
            add(Account(name = "Cuenta 3", balance = 2000000.0))
            add(Account(name = "Cuenta 4", balance = 2000000.0))
            add(Account(name = "Cuenta 5", balance = 2000000.0))
            add(Account(name = "Cuenta 1", balance = 2000000.0))
            add(Account(name = "Cuenta 2", balance = 2000000.0))
            add(Account(name = "Cuenta 3", balance = 2000000.0))
            add(Account(name = "Cuenta 4", balance = 2000000.0))
            add(Account(name = "Cuenta 5", balance = 2000000.0))
        }

    }
}