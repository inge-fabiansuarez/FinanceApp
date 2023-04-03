package com.fabiansuarez.financeapp.model.entities

data class Account(val id: Long = 0, var name: String, var balance: Double) {

    fun getBalanceInText(): String {
        return "$ - 3.500.000 COP"
    }
}