package com.example.library.model

open class TokenResponse() {
    var tokenPaymentInstrument: TokenPaymentInstrument =
        TokenPaymentInstrument()
    var description: String = ""
    var tokenExpiryDateTime: String = ""
    var paymentInstrument: PaymentInstrument = PaymentInstrument()
    var _links: Links = Links()

    open class TokenPaymentInstrument() {
        var type: String = ""
        var hred: String = ""
    }
}