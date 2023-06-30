package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvWeb = findViewById<TextView>(R.id.txtWeb)
        val tvEmail = findViewById<TextView>(R.id.txtEmail)
        val tvPhone = findViewById<TextView>(R.id.txtPhone)

        //for web address
        tvWeb.setText("Please visit us: www.google.com")
        Linkify.addLinks(tvWeb, Linkify.WEB_URLS)

        //for email address
        tvEmail.setText("Please Email Us:abcdef@gmail.com")
        Linkify.addLinks(tvEmail,Linkify.EMAIL_ADDRESSES)

        //for phone number
        tvPhone.setText("Please Call Us: +4672123456")
        Linkify.addLinks(tvPhone,Linkify.PHONE_NUMBERS)
    }
}


