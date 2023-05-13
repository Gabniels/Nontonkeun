package com.gabniel.data.remote.source.anime

import com.gabniel.data.NetworkResource
import com.gabniel.data.remote.Response.AnimeItem
import com.gabniel.data.remote.Response.AnimeResponse
import com.gabniel.data.remote.network.ApiResponse
import com.gabniel.domain.Repository.AnimeRepository
import com.gabniel.domain.Resource
import com.gabniel.domain.model.AnimeModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val remoteDataSource: AnimeRemoteDataSource,
) : AnimeRepository {

//    override fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>> =
//        object : NetworkResource<List<AnimeModel>, AnimeResponse>() {
//
//        }
//
//    }

    //    override fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>> {
//        object : NetworkResource<List<AnimeModel>, AnimeResponse>() {
//            override suspend fun callRequest(): Flow<ApiResponse<AnimeResponse>> {
//                return remoteDataSource.getRecommendationAnime()
//            }
//
//            override suspend fun resultResponse(data: AnimeResponse): List<AnimeModel> {
//                return AnimeItem.transformDomain(data)
//            }
//
//            override fun shouldFetch(data: List<AnimeModel>?): Boolean {
//                return false
//            }
//        }
//    }
    override fun getRecommendationAnime(): Flow<Resource<List<AnimeModel>>> {
        TODO("Not yet implemented")
    }


}