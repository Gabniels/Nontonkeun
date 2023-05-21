package com.gabniel.nontonkeun.ui.anime

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.gabniel.domain.model.AnimeModel
import com.gabniel.nontonkeun.R
import com.gabniel.nontonkeun.databinding.ItemAnimeBinding
import com.squareup.picasso.Picasso

class AnimeAdapter(
    private val listener: Listener,
) : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<AnimeModel>() {
        override fun areItemsTheSame(oldItem: AnimeModel, newItem: AnimeModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: AnimeModel, newItem: AnimeModel): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallback)

    inner class AnimeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemAnimeBinding.bind(view)
        fun bindData(data: AnimeModel) {
            binding.apply {
                Picasso.get().load(data.entry[0].images?.jpg?.image_url)
                    .into(binding.imgPosterAnime)
                txtTitleAnime.text = data.entry[0].title
            }
            itemView.setOnClickListener {
                listener.onClickListener(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_anime, parent, false))
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindData(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    interface Listener {
        fun onClickListener(data: AnimeModel)
    }

}