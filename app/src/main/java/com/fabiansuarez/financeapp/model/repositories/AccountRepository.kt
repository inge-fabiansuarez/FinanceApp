package com.fabiansuarez.financeapp.model.repositories

import com.fabiansuarez.financeapp.model.entities.Account

class AccountRepository {

    lateinit var accountsList: List<Account>

    fun loadFakeData() {

    }
}