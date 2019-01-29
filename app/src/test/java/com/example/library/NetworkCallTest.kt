package com.example.library

import com.example.library.api.DataConvert
import com.example.library.api.NetworkCallMock
import com.example.library.api.NetworkInterface
import junit.framework.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class NetworkCallTest {
    @Test
    fun testCall() {
        val fileName = "token.json"
        var json = ""
        val inputStream = this.javaClass.classLoader.getResourceAsStream(fileName)
        json = Utils.readTextStream(inputStream)
        NetworkCallMock().MakeCall("token", object : NetworkInterface {
            override fun Response(call: String, result: String?) {
                assertFalse(result!!.isEmpty())
                val response = DataConvert().TokenResponseConvert(result)
                assertNotNull(response)
                assertNotNull(response.description)
                assertTrue(response._links.curies.size > 0)
            }
        })
    }
}