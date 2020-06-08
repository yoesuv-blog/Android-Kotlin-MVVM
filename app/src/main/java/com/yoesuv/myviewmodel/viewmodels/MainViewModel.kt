package com.yoesuv.myviewmodel.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.databinding.ObservableField
import com.yoesuv.myviewmodel.models.Mahasiswa

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var nim: ObservableField<String> = ObservableField()
    var nama: ObservableField<String> = ObservableField()
    var jurusan: ObservableField<String> = ObservableField()

    fun setData(mahasiswa: Mahasiswa){
        nim.set(mahasiswa.nim)
        nama.set(mahasiswa.nama)
        jurusan.set(mahasiswa.jurusan)
    }

}