package com.efel.kot5raihanefelmaulana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var nama:EditText
    lateinit var harga:EditText
    lateinit var jumlah:EditText
    lateinit var send:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.outNama)
        harga = findViewById(R.id.outharga)
        send = findViewById(R.id.btnSend)
        jumlah = findViewById(R.id.outjumlah)

        send.setOnClickListener{

            var bundle = Bundle()
            bundle.putString("nama",nama.text.toString())
            bundle.putString("jumlah",jumlah.text.toString())
            bundle.putString("harga",harga.text.toString())

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtras(intent)
            startActivity(intent)
        }
    }
}