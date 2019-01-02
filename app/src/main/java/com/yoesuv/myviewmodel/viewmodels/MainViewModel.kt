package com.yoesuv.myviewmodel.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
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