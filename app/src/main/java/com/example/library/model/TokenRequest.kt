package com.example.library.model

open class TokenRequest() {
    var description: String = ""
    var tokenExpiryDateTime: String = ""
    var paymentInstrument: PaymentInstrument = PaymentInstrument()
}