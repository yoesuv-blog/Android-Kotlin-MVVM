package com.yoesuv.myviewmodel.views

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.yoesuv.myviewmodel.R
import com.yoesuv.myviewmodel.databinding.ActivityMainBinding
import com.yoesuv.myviewmodel.models.Mahasiswa
import com.yoesuv.myviewmodel.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.main = viewModel

        val mhs = Mahasiswa("15201234","Leonel Messi","Informatika")
        viewModel.setData(mhs)
    }
}
