package com.example.library

interface Callback {
    fun Payment()
    fun PaymentFailed()
    fun Timeout()
}