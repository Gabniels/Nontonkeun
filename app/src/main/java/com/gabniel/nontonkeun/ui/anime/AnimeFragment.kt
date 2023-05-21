package com.gabniel.nontonkeun.ui.anime

import android.content.Intent
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.gabniel.domain.Resource
import com.gabniel.domain.model.AnimeModel
import com.gabniel.nontonkeun.base.BaseFragment
import com.gabniel.nontonkeun.databinding.FragmentAnimeBinding
import com.gabniel.nontonkeun.ui.detailanime.DetailAnimeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding>(), AnimeAdapter.Listener {

    private val viewModel: AnimeViewModel by viewModels()
    private val recommendationAdapter: AnimeAdapter by lazy { AnimeAdapter(this) }

    override fun initializationView(inflater: LayoutInflater): FragmentAnimeBinding {
        return FragmentAnimeBinding.inflate(inflater)
    }

    override fun setupView() {
        setupRecommendationAnime()
    }

    override fun initialization() {
        getRecommendationAnime()
    }

    private fun getRecommendationAnime() {
        viewModel.getRecommendationAnime.observe(this) { response ->
            when (response) {
                is Resource.Loading -> {}
                is Resource.Success -> {
                    if (!response.data.isNullOrEmpty()) {
                        recommendationAdapter.differ.submitList(response.data)
                    }
                }
                is Resource.Error -> {}
            }
        }
    }

    private fun setupRecommendationAnime() {
        binding.rvRecommendationAnime.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = recommendationAdapter
        }
    }

//    private fun setupTopAnime() {
//        binding.rvTopAnime.apply {
//            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//            adapter = topAdapter
//        }
//    }

    companion object {
        val TAG = AnimeFragment::class.simpleName
    }

    override fun onClickListener(data: AnimeModel) {
        val intent = Intent(context, DetailAnimeActivity::class.java)
        intent.putExtra("ANIME", data)
        startActivity(intent)
    }

}