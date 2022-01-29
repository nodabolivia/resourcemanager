package com.cursoandroid.practico1.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.core.view.get
import com.cursoandroid.practico1.R
import com.cursoandroid.practico1.databinding.ActivityMyWebViewBinding
import com.cursoandroid.practico1.models.Recurso

class MyWebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyWebViewBinding
    private lateinit var miWebView: WebView
    private lateinit var enlaceURL: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMyWebViewBinding.inflate(layoutInflater)
        miWebView = binding.wvMain
        miWebView.webViewClient = object : WebViewClient() {
        }
        val settings: WebSettings = miWebView.settings
        settings.javaScriptEnabled = true
        enlaceURL = intent.getStringExtra("enlace")!!
        miWebView.loadUrl(enlaceURL)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        if (miWebView!!.canGoBack()) {
            miWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }

}