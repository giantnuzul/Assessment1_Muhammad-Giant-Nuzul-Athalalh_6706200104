package org.d3if0104.assessment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.d3if0104.assessment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHitung.setOnClickListener { hitung() }
    }

    private fun hitung() {
        val nama = binding.etNama.text.toString()
        if (TextUtils.isEmpty(nama)){
            Toast.makeText(this, R.string.nama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val harga = binding.etHarga.text.toString()
        if (TextUtils.isEmpty(harga)){
            Toast.makeText(this, R.string.harga_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val jumlah = binding.etJumlah.text.toString().toDouble()
        if (TextUtils.isEmpty(jumlah.toString())){
            Toast.makeText(this, R.string.jumlah_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val ppn = (harga.toDouble() * jumlah) * 10/100
        binding.tvHasil.text = getString(R.string.hasil_x, ppn)
        val total = ppn + (harga.toDouble()* jumlah)
        binding.tvTotal.text = getString(R.string.total_x, total)
    }
}


