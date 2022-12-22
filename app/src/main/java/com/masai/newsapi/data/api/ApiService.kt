package com.masai.newsapi.data.api

import com.masai.newsapi.data.model.Articles
import com.masai.newsapi.data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //https://newsapi.org/v2/everything?q=tesla&from=2021-12-24&to=2021-12-24&apiKey="API_Key"
    //https://newsapi.org/v2/everything?q=tesla&apiKey="API_Key"

    @GET("v2/everything")
    suspend fun getNewsData(
        @Query("q") query: String,
//        @Query("from") from: String,
//        @Query("to") to: String,
        @Query("apiKey") key: String
    ): NewsResponse
}
