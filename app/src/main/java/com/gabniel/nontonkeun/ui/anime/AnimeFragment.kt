package com.gabniel.nontonkeun.ui.anime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabniel.nontonkeun.R
import com.gabniel.nontonkeun.base.BaseFragment
import com.gabniel.nontonkeun.databinding.FragmentAnimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding>() {

    override fun initializationView(inflater: LayoutInflater): FragmentAnimeBinding {
       return FragmentAnimeBinding.inflate(inflater)
    }

    override fun setupView() {

    }

    override fun initialization() {

    }

}