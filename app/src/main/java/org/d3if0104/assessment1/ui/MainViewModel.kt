package org.d3if0104.assessment1.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if0104.assessment1.model.HasilPajak

class MainViewModel : ViewModel() {
    private val hasilPajak = MutableLiveData<HasilPajak?>()

    fun hitung (harga: Double,jumlah: Double) {
       val ppn = (harga * jumlah) * 10/100
       val total = ppn + (harga * jumlah)
       hasilPajak.value = HasilPajak(ppn,total)
   }
    fun getHasilPajak(): LiveData<HasilPajak?> = hasilPajak
}