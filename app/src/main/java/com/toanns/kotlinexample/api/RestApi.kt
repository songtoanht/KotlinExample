package com.toanns.kotlinexample.api

import retrofit2.Call
import retrofit2.Retrofit

/**
 * @author ToanNS
 */
class RestApi {
    private val redditApi: RedditApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .build()

        redditApi = retrofit.create(RedditApi::class.java)
    }

    fun getNews(after: String, limit: String): Call<RedditNewsResponse> {
        return redditApi.getTop(after, limit)
    }
}