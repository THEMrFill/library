package com.example.library.api

import com.example.library.model.TokenResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder

open class DataConvert {
    open fun TokenResponseConvert(string: String): TokenResponse {
        return Gson().fromJson(string, TokenResponse::class.java)
    }

}