package com.gabniel.nontonkeun.ui.manga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabniel.nontonkeun.R
import com.gabniel.nontonkeun.base.BaseFragment
import com.gabniel.nontonkeun.databinding.FragmentMangaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding>() {
    override fun initializationView(inflater: LayoutInflater): FragmentMangaBinding {
       return FragmentMangaBinding.inflate(inflater)
    }

    override fun setupView() {

    }

    override fun initialization() {

    }

}