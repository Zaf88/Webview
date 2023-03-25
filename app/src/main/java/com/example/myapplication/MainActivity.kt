package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import okhttp3.OkHttpClient
import okhttp3.Request


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val webView: WebView = findViewById(R.id.webView)
        webView.loadUrl("https://html5test.com/.")
        webView.settings.javaScriptEnabled = true
    }
}

val client = OkHttpClient()

val request = Request.Builder()
    .url("https://www.example.com")
    .build()

val response = client.newCall(request).execute()
val responseBody = response.body?.string()




