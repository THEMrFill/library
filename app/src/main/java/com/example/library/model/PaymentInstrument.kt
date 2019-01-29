package com.example.library.model

open class PaymentInstrument(
    var type: String = "card/plain",
    var cardHolderName: String = "",
    var cardExpiryDate: ExpiryDate = ExpiryDate(),
    var cardNumber: String = "",
    var billingAddress: Address = Address()
) {
    open class ExpiryDate() {
        var month: Int = 0
        var year: Int = 0

        constructor(month: Int, year: Int) : this() {
            this.month = month
            this.year = year
        }
    }
    open class Address() {
        var address1: String = ""
        var address2: String? = ""
        var address3: String? = ""
        var postalCode: String? = ""
        var city: String? = ""
        var state: String = ""
        var countryCode: String = ""

        constructor(
            address1: String, address2: String?, address3: String?,
            postalCode: String?, city: String?, state: String, countryCode: String
        ) : this() {
            this.address1 = address1
            this.address2 = address2
            this.address3 = address3
            this.postalCode = postalCode
            this.city = city
            this.state = state
            this.countryCode = countryCode
        }
    }
}