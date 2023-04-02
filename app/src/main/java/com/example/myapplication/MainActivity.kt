package com.example.myapplication

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.webkit.WebView
//import android.widget.ImageView
//import com.bumptech.glide.Glide
//import okhttp3.OkHttpClient
//import okhttp3.Request
//import java.net.URL
//import java.net.URLConnection
//
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        fun main() {
//            fun URLConnection.setRequestMethod(s: String) {
//
//            }
//            val endpointUrl = "https://testtasks.nutgeek.fun/a/"
//            val url = URL(endpointUrl)
//            val connection = url.openConnection()
//            connection.setRequestProperty("Content-Type", "application/json")
//            connection.setRequestMethod("GET")
//            val inputStream = connection.getInputStream()
//            val response = inputStream.bufferedReader().use { it.readText() }
//
//            if (endpointUrl.contains("https://testtasks.nutgeek.fun/a/")) {
//
//                println(R.drawable.placeholder_image)
//            } else {
//                println("https://html5test.com/.")
//            }
//        }
//
////        val imageView: ImageView = findViewById(R.id.imageView)
////        Glide.with(this)
////            .load("https://wallpapers.com/mobile")
////            .placeholder(R.drawable.placeholder_image)
////            .into(imageView)
//
//
//        val webView: WebView = findViewById(R.id.webView)
//        webView.loadUrl("https://html5test.com/.")
//        webView.settings.javaScriptEnabled = true
//    }
//}
//
//
//
//val client = OkHttpClient()
//
//val request = Request.Builder()
//    .url("https://wallpapers.com/mobile")
//    .build()
//
//val response = client.newCall(request).execute()
//val responseBody = response.body?.string()


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        val url1 = "https://html5test.com"
        val url2 = "https://wallpapers.com/mobile"
        if (url1.startsWith("https://testtasks.nutgeek.fun/a/")) {
            webView.loadUrl(url2)
        } else {
            webView.loadUrl(url1)
        }
    }
}




