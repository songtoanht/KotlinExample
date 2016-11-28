package com.toanns.kotlinexample.api

/**
 * @author ToanNS
 */
class RedditNewsResponse(val data:RedditDataResponse)

class RedditDataResponse(
        val children: RedditChildrenResponse,
        val after: String,
        val before: String
)

class RedditChildrenResponse(
        val data: RedditChildrenDataResponse
)

class RedditChildrenDataResponse(
        val author: String,
        val title: String
)