package com.efel.kot5raihanefelmaulana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    lateinit var outnama:TextView
    lateinit var outjumlah:TextView
    lateinit var outharga:TextView
    lateinit var outtotal:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        outnama = findViewById(R.id.OutputNama)
        outjumlah = findViewById(R.id.OutputJumlah)
        outharga = findViewById(R.id.OutputHarga)
        outtotal = findViewById(R.id.Outputtotal)

        val bundle = intent.extras
        if (bundle !=null){
            outnama.text = "Nama Barang = ${bundle.getString("nama")}"
            outjumlah.text = "Jumlah Beli = ${bundle.getString("jumlah")}"
            outharga.text = "Harga Satuan = ${bundle.getString("harga")}"
        }
    }
}