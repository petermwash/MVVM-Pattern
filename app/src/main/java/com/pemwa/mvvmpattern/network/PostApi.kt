package com.pemwa.mvvmpattern.network

import com.pemwa.mvvmpattern.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {

    /**
     * Get the list of the posts from the API
     */
    @GET("/posts")
    fun getPosts() : Observable<List<Post>>
}
