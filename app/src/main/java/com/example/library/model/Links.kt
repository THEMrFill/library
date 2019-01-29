package com.example.library.model

import com.google.gson.annotations.SerializedName

class Links() {
    @SerializedName("tokens:token")
    var tokensToken: Link = Link()
    @SerializedName("tokens:description")
    var tokensDescription: Link = Link()
    @SerializedName("tokens:cardHolderName")
    var tokensCardHolderName: Link = Link()
    @SerializedName("tokens:cardExpiryDate")
    var tokensCardExpiryDate: Link = Link()
    @SerializedName("tokens:billingAddress")
    var tokensBillingAddress: Link = Link()
    var curies: List<Link> = ArrayList()
}