/*
package com.example.call

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage


class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        val data = intent.extras
        val pdus = data!!["pdus"] as Array<Any>?
        for (i in pdus!!.indices) {
            val smsMessage: SmsMessage = SmsMessage.createFromPdu(pdus[i] as ByteArray)
            val sender: String = smsMessage.getDisplayOriginatingAddress()
            //Check the sender to filter messages which we require to read
            if (sender == "GADGETSAINT") {
                val messageBody: String = smsMessage.getMessageBody()
                //Pass the message text to interface
                mListener!!.messageReceived(messageBody)
            }
        }
    }

    companion object {
        //interface
        private var mListener: SmsListener? = null

        fun bindListener(listener: SmsListener?) {
           mListener = listener
        }
    }
}
*/














