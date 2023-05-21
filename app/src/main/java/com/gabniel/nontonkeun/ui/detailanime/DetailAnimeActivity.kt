package com.gabniel.nontonkeun.ui.detailanime

import android.view.LayoutInflater
import com.gabniel.domain.model.AnimeModel
import com.gabniel.nontonkeun.base.BaseActivity
import com.gabniel.nontonkeun.databinding.ActivityDetailAnimeBinding
import com.gabniel.nontonkeun.utils.Utils.parcelable
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailAnimeActivity : BaseActivity<ActivityDetailAnimeBinding>() {
    override fun initializationView(inflater: LayoutInflater): ActivityDetailAnimeBinding {
        return ActivityDetailAnimeBinding.inflate(inflater)
    }

    override fun setupView() {

    }

    override fun initialization() {
        getData()
    }

    private fun getData() {
        val anime = intent.parcelable<AnimeModel>("ANIME")


        Picasso.get().load(anime?.entry?.get(0)?.images?.jpg?.large_image_url).into(binding.imgBackground)
        Picasso.get().load(anime?.entry?.get(0)?.images?.jpg?.large_image_url)
            .into(binding.imgPoster)
        binding.txtTitle.text = anime?.entry?.get(0)?.title
        binding.txtSinopsis.text = anime?.content

    }


}