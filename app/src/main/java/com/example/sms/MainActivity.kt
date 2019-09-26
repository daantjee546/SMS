package com.example.sms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.content.Intent
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendSMS(view: View) {

        for (i in 6 downTo 0 step 1)
        {
            val phoneNumber = findViewById<TextView>(R.id.phoneNumberID)
            val phoneNumberString = phoneNumber.text.toString()
            val message = findViewById<TextView>(R.id.messageID)
            val messageString = message.text.toString()
    
            val smsManager = SmsManager.getDefault()
            smsManager.sendTextMessage(phoneNumberString, null, messageString, null, null)

            val myToast = Toast.makeText(this, "SMS send", Toast.LENGTH_SHORT)
            myToast.show()

        }

        }
}
