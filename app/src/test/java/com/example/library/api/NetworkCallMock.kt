package com.example.library.api

import com.example.library.Utils

class NetworkCallMock() {
    fun MakeCall(type: String, response: NetworkInterface) {
        when (type) {
            "token" -> {
                val fileName = "token.json"
                var json = ""
                val inputStream = this.javaClass.classLoader.getResourceAsStream(fileName)
                json = Utils.readTextStream(inputStream)
                response.Response(type, json)
            }
        }
    }
}