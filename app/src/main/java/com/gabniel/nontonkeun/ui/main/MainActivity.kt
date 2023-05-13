package com.gabniel.nontonkeun.ui.main

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.gabniel.nontonkeun.R
import com.gabniel.nontonkeun.base.BaseActivity
import com.gabniel.nontonkeun.databinding.ActivityMainBinding
import com.gabniel.nontonkeun.ui.anime.AnimeFragment
import com.gabniel.nontonkeun.ui.manga.MangaFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun initializationView(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun setupView() {

    }

    override fun initialization() {
        setupFragment()
    }

    private fun setupFragment() {
        binding.bottomNavigation.setOnItemSelectedListener { nav ->
            when (nav) {
                R.id.menuAnime -> {
                    callFragment(AnimeFragment())
                }
                R.id.menuManga -> {
                    callFragment(MangaFragment())
                }
                R.id.menuCharacter -> {

                }
            }
        }
    }

    private fun callFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

}