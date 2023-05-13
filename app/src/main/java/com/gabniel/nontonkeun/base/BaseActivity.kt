package com.gabniel.nontonkeun.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    protected lateinit var binding: VB
    protected abstract fun initializationView(inflater: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getInflatedLayout())
        setupView()
        initialization()
    }

    abstract fun setupView()
    abstract fun initialization()

    private fun getInflatedLayout(): View {
        binding = initializationView(layoutInflater)
        return binding.root
    }

}