package com.example.library.api

import android.os.AsyncTask
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader

class NetworkCall {
    fun MakeCall(type: String, response: NetworkInterface) {
        GetJsonWithOkHttpClient(type, response).execute()
    }

    open class GetJsonWithOkHttpClient(private val type: String, response: NetworkInterface) : AsyncTask<Unit, Unit, String>() {
        val innerType = type
        val innerResponse = response

        override fun doInBackground(vararg params: Unit?): String? {
            val networkClient = NetworkClient()
            var extra: String = ""
            if (innerType.equals("s"))
                extra = "*"
            val url = String.format("%s", Globals.API_URL)
            when (url) {
                "token" -> {}
            }
            val stream = BufferedInputStream(networkClient.get(url))
            return readStream(stream)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            innerResponse.Response(type, result)
        }

        fun readStream(inputStream: BufferedInputStream): String {
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val stringBuilder = StringBuilder()
            bufferedReader.forEachLine { stringBuilder.append(it) }
            return stringBuilder.toString()
        }
    }
}